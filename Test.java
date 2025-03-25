import javax.swing.*;
import java.util.*;

class PersonInfo {
    String name;
    String addr;
    String phone;

    public PersonInfo(String n, String a, String p) {
        name = n;
        addr = a;
        phone = p;
    }

    public void print() {
        JOptionPane.showMessageDialog(null, "name: " + name + " address: " + addr + " phone no: " + phone);
    }
}

class AddressBook {
    
    ArrayList<PersonInfo> persons;

    public AddressBook() {
        persons = new ArrayList<>();
    }

    public void addPerson() {
        String name = JOptionPane.showInputDialog("Enter name: ");
        String addr = JOptionPane.showInputDialog("Enter address: ");
        String phone = JOptionPane.showInputDialog("Enter phone: ");
        PersonInfo p = new PersonInfo(name, addr, phone);
        persons.add(p);
    }

    public void searchPerson(String name) {
        for (PersonInfo p : persons) {
            if (name.equals(p.name)) {
                p.print();
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Person not found.");
    }

    public void deletePerson(String name) {
        Iterator<PersonInfo> iterator = persons.iterator();
        while (iterator.hasNext()) {
            PersonInfo p = iterator.next();
            if (name.equals(p.name)) {
                iterator.remove();
                JOptionPane.showMessageDialog(null, "Person deleted.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Person not found.");
    }
}

class Test {
    public static void main(String args[]) {
        AddressBook ab = new AddressBook();
        String input, name;
        int ch;

        while (true) {
            input = JOptionPane.showInputDialog("Enter 1 to add \nEnter 2 to search \nEnter 3 to Delete \nEnter 4 to Exit");
            ch = Integer.parseInt(input);

            switch (ch) {
                case 1:
                    ab.addPerson();
                    break;
                case 2:
                    name = JOptionPane.showInputDialog("Enter name to search: ");
                    ab.searchPerson(name);
                    break;
                case 3:
                    name = JOptionPane.showInputDialog("Enter name to delete: ");
                    ab.deletePerson(name);
                    break;
                case 4:
                    System.exit(0);
            }
        }
    }
}
