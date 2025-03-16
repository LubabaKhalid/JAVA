import java.util.Scanner;
class InvalidMarksException extends Exception {
    public InvalidMarksException(String message) {
        super(message);  
    }
}
class Student {
    String name;
    int marks;
    public Student(String name, int marks) {
        this.name=name;
        this.marks=marks;
    }
    public String assignGrade() throws InvalidMarksException {
        if(marks<0 || marks>100) {
            throw new InvalidMarksException("Invalid marks. Marks must be between 0 and 100.");
        }

        if(marks>=85) {
            return "A";
        } else if(marks>=70) {
            return "B";
        } else if(marks>=50) {
            return "C";
        } else {
            return "F";
        }
    }
}

public class BSDSF22A025_Web_Lab04_task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter student's name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student's marks: ");
            int marks = scanner.nextInt();
            Student student = new Student(name, marks);
            String grade = student.assignGrade();
            System.out.println("Assigned Grade: " + grade);
        } catch (InvalidMarksException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Grade assigned successfully.");
        }
        scanner.close();
    }
}
