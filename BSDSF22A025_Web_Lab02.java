import java.util.*;
abstract class Staff {
    public String name;
    public String id;
    public String department;

    public Staff(String name,String id,String department) {
        this.name=name;
        this.id=id;
        this.department=department;
    }
    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "Name: "+name+", ID: "+id+", Department: "+department;
    }
}


class Professor extends Staff {
    private double monthlySalary;

    public Professor(String name, String id, String department, double monthlySalary){
        super(name,id,department);
        this.monthlySalary=monthlySalary;
    }

    @Override
    public double calculateSalary() {
        return monthlySalary; 
    }

    @Override
    public String toString() {
        return super.toString() +", Position: Professor, Monthly Salary: "+calculateSalary();
    }
}

class Lecturer extends Staff {
    private int lecturesDelivered;
    private double payPerLecture;

    public Lecturer(String name,String id,String department,int lecturesDelivered,double payPerLecture) {
        super(name,id,department);
        this.lecturesDelivered=lecturesDelivered;
        this.payPerLecture=payPerLecture;
    }

    @Override
    public double calculateSalary() {
        return lecturesDelivered * payPerLecture; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Lecturer, Lectures Delivered: " + lecturesDelivered + ", Salary: " + calculateSalary();
    }
}

class Administrator extends Staff {
    private double baseSalary;
    private double performanceBonus;

    public Administrator(String name, String id, String department, double baseSalary, double performanceBonus) {
        super(name, id, department);
        this.baseSalary = baseSalary;
        this.performanceBonus = performanceBonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + performanceBonus; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Administrator, Base Salary: " + baseSalary + ", Performance Bonus: " + performanceBonus + ", Total Salary: " + calculateSalary();
    }
}

class ResearchAssistant extends Staff {
    private double stipend;
    private double researchGrant;

    public ResearchAssistant(String name,String id,String department,double stipend,double researchGrant) {
        super(name,id,department);
        this.stipend=stipend;
        this.researchGrant=researchGrant;
    }

    @Override
    public double calculateSalary() {
        return stipend+researchGrant; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Position: Research Assistant, Stipend: "+stipend +", Research Grant: "+ researchGrant +", Total Salary: " + calculateSalary();
    }
}



public class BSDSF22A025_Web_Lab02 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Staff[] staffArray=new Staff[4]; 
        
        
        for (int i=0; i<staffArray.length; i++) {
            System.out.println("Enter details for Staff member "+ (i + 1) +":");

            System.out.print("Enter Name: ");
            String name = scanner.nextLine();

            System.out.print("Enter ID: ");
            String id = scanner.nextLine();

            System.out.print("Enter Department: ");
            String department=scanner.nextLine();

            System.out.println("Select the position: 1. Professor 2. Lecturer 3. Administrator 4. Research Assistant");
            int choice=scanner.nextInt();
            scanner.nextLine();  

            switch (choice) {
                case 1: 
                    System.out.print("Enter Monthly Salary: ");
                    double monthlySalary = scanner.nextDouble();
                    scanner.nextLine(); 
                    staffArray[i] = new Professor(name, id, department, monthlySalary);
                    break;
                case 2: 
                    System.out.print("Enter Number of Lectures Delivered: ");
                    int lecturesDelivered = scanner.nextInt();
                    System.out.print("Enter Pay Per Lecture: ");
                    double payPerLecture = scanner.nextDouble();
                    scanner.nextLine(); 
                    staffArray[i] = new Lecturer(name, id, department, lecturesDelivered, payPerLecture);
                    break;
                case 3: 
                    System.out.print("Enter Base Salary: ");
                    double baseSalary = scanner.nextDouble();
                    System.out.print("Enter Performance Bonus: ");
                    double performanceBonus = scanner.nextDouble();
                    scanner.nextLine(); 
                    staffArray[i] = new Administrator(name, id, department, baseSalary, performanceBonus);
                    break;
                case 4: 
                    System.out.print("Enter Stipend: ");
                    double stipend = scanner.nextDouble();
                    System.out.print("Enter Research Grant: ");
                    double researchGrant = scanner.nextDouble();
                    scanner.nextLine(); 
                    staffArray[i] = new ResearchAssistant(name, id, department, stipend, researchGrant);
                    break;
                default:
                    System.out.println("Invalid selection. Please try again.");
                    i--; 
                    break;
            }
        }

        
        System.out.println("\nStaff Details and Salaries:");
        for (Staff staff : staffArray) {
            if (staff!=null) {
                System.out.println(staff.toString());
                System.out.println("Calculated Salary: "+ staff.calculateSalary() +"\n");
            }
        }

        scanner.close();
    }
}
