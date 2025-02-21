class Student{
    
    String name="";
    int age=0;
    int semester=0;
    static int count=0;

    public void studentInfo(){
        System.out.println("Student info is : "+this.name+" "+this.age);

    }
    Student(){
        System.out.println("Default constructor");
        count++;
    }
    Student(String name,int age,int s){
        this.name=name;
        this.age=age;
        this.semester=s;
        System.out.println("Parameterized constructor "+this.name);
        count++;
    }
    Student(Student s){
        this.name=s.name;
        this.age=s.age;
        this.semester=s.semester;
        System.out.println("Copy constructor ");
        count++;
    }
    static void stdcount(){
        System.out.println("Students count is : "+count);
    }
}
public class OOPS{
    public static void main(String arg[])
    {
        Student s1=new Student();
        s1.name="Lubaba";
        s1.age=22;
        s1.semester=6;
        s1.studentInfo();

        Student s2=new Student("biya",21,6);

        Student s3=new Student(s1);
        s3.studentInfo();
        Student s4=new Student();
        Student.stdcount();
        
    }
    
}
