import java.util.*;
class Car {
    private String model;
    private String make;
    private int year;
    private double price;

    public Car(){
        model="";
        make="";
        year=0;
        price=0.0;
    }

    public Car(String model,String make,int year,double price){
        model=model;
        make=make;
        year=year;
        price=price;
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

public class CarDriver {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        Car[] cars=new Car[5];
        for(int i=0;i<5;i++){
            cars[i]=new Car();
            cars[i].inputData();
        }
        System.out.println("\nEnter Car Details : ");
        for(Car car : cars){
            car.Display();
            System.out.println();

        }
        Car hi=cars[0];
        for(Car car : cars){
            if(car.getPrice()>hi.getPrice()){
                hi=car;
            }
        }
        System.out.println("Car of highest Price is: ");
        hi.Display();
    }
}
