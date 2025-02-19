import java.util.*;
public class arc {
    private String model;
    private String make;
    private int year;
    private double price;

    public arc(){
        this.model="";
        this.make="";
        this.year=0;
        this.price=0.0;
    }

    public arc(String model,String make,int year,double price){
        this.model=model;
        this.make=make;
        this.year=year;
        this.price=price;
    }
    public String getModel(){
        return model;
    }
    public String getMake(){
        return make;
    }
    public int getYear(){
        return year;
    }
    public double getPrice(){
        return price;
    }
    public void setModel(String model){
        this.model=model;
    }
    public void setMake(String make){
        this.make=make;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setPrice(double price){
        this.price=price;
    }
    public void inputData(){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter model : ");
        this.model=sc.nextLine();
        System.out.print("Enter make : ");
        this.make=sc.nextLine();
        System.out.print("Enter year : ");
        this.year=sc.nextInt();
        System.out.print("Enter price : ");
        this.price=sc.nextDouble();
        sc.nextLine();
    }

    public void Display(){
        System.out.println("Car's Model : "+model);
        System.out.println("Car's Make : "+make);
        System.out.println("Car's Year : "+year);
        System.out.println("Car's Price : "+price);
    }
}
