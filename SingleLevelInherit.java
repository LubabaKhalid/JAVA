class Shape{
    public void printInfo(){
        System.out.print("Display area ");
    }
}

class Triangle extends Shape{
    public void printInfo(int l,int h){
        super.printInfo();
        double area=0.5*l*h;
        System.out.println(area);
    }

}

class Equilaterial{

}
public class SingleLevelInherit {
    public static void main(String arg[]){
        Triangle t=new Triangle();
        t.printInfo(2,4);


    }
}
