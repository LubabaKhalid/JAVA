import java.util.*;
class Std {
    private int rollno;
    private String name;
    private String email;
    private String address;

    Std(){
        this.rollno=0;
        this.name="";
        this.email="";
        this.address="";
    }
    Std(int r,String n,String e,String a){
        this.rollno=r;
        this.name=n;
        this.email=e;
        this.address=a;
    }
    Std(Std s){
        this.rollno=s.rollno;
        this.name=s.name;
        this.email=s.email;
        this.address=s.address;
    }
    public int getRollno(){
        return this.rollno;
    }

    public void setRollno(int r){
        this.rollno=r;
    }
    public void setName(String n){
        this.name=n;
    }
    public String geName(){
        return this.name;
    }
    public void setEmail(String e){
        this.email=e;
    }
    public String getEmail(){
        return this.email;
    }
    public void setAddress(String a){
        this.address=a;
    }
    public String getAddress(){
        return this.address;
    }

    public void inputData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Roll No : ");
        this.rollno=sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name : ");
        this.name=sc.nextLine();
        System.out.print("Enter Email : ");
        this.email=sc.nextLine();
        System.out.print("Enter Address : ");
        this.address=sc.nextLine();

    }
    public void showData(){
        System.out.println(this.rollno+" "+this.name+" "+this.address+" "+this.email);
    }
    

}
public class Driver{
    public static void main(String args[]){
        Std[] s=new Std[1];
        for(int i=0;i<s.length;i++)
        {
            s[i]=new Std();
            s[i].inputData();
            s[i].showData();
        } 
    }
}

