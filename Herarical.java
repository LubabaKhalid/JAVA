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

class EquiLiteril extends Shape{
    public void printInfo(int l)
    {
        super.printInfo();
        double area=2*l*l;
        System.out.println(area);
    }
}
public class Herarical {
    public static void main(String arg[])
    {
        Triangle t=new Triangle();
        EquiLiteril e=new EquiLiteril();
        t.printInfo(2,3);
        e.printInfo(2);

    }
}
