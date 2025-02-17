import java.util.*;
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
