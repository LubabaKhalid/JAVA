import java.io.*;
import java.util.HashMap;
import java.util.*;

class Book implements Serializable {
    int bookID;
    String title;
    String author;
    boolean isAvailable;

    public Book(int bookID, String title, String author) {
        this.bookID=bookID;
        this.title=title;
        this.author=author;
        this.isAvailable=true;
    }
}

class LibraryManager {
    private Map<Integer,Book> bookRecords;

    public LibraryManager() {
        bookRecords=new HashMap<>();
    }

    public void addBook(int id, String title, String author) {
        if (!bookRecords.containsKey(id)) {
            bookRecords.put(id, new Book(id, title, author));
        } else {
            System.out.println("Book with this ID already exists.");
        }
    }

    public void borrowBook(int id) {
        Book book = bookRecords.get(id);
        if (book != null && book.isAvailable) {
            book.isAvailable = false;
            System.out.println("You have borrowed the book: " + book.title);
        } else {
            System.out.println("Book is not available or doesn't exist.");
        }
    }

    public void returnBook(int id) {
        Book book = bookRecords.get(id);
        if (book != null && !book.isAvailable) {
            book.isAvailable = true;
            System.out.println("You have returned the book: " + book.title);
        } else {
            System.out.println("This book wasn't borrowed or doesn't exist.");
        }
    }

    public void displayBooks() {
        for (Book book : bookRecords.values()) {
            System.out.println("ID: " + book.bookID + ", Title: " + book.title + ", Author: " + book.author + ", Available: " + book.isAvailable);
        }
    }

    public void saveToFile(String filename) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(filename))) {
            oos.writeObject(bookRecords);
            System.out.println("Data saved to file.");
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }

    public void loadFromFile(String filename) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(filename))) {
            bookRecords = (Map<Integer, Book>) ois.readObject();
            System.out.println("Data loaded from file.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error loading data: " + e.getMessage());
        }
    }
}

public class BSDSF22A025_Web_lab6 {
    public static void main(String[] args) {
        LibraryManager library = new LibraryManager();

        library.addBook(1, "History of Pakistan", "Dr. Riaz Ahmad");
        library.addBook(2, "1984", "George Orwell");
        library.addBook(3, "The Idea of Pakistan", "Stephen P. Cohen");
        library.displayBooks();
        library.borrowBook(1);
        library.returnBook(1);
        library.saveToFile("library_data.ser");
        library.loadFromFile("library_data.ser");
        library.displayBooks();
    }
}

