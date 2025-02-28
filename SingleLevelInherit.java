class Shape{
    public void printInfo(){
        System.out.println("Display area ");
    }
}

class Triangle extends Shape{
    public void printInfo(int l, int h){
        System.out.println(1/2*l*h);
    }

}

class Equilaterial{

}
public class SingleLevelInherit {
    public static void main(String arg[]){
        Triangle t=new Triangle();
        t.printInfo(2,3);


    }
}
