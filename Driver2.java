class Shape{
    double area;
    double volume;

    public Shape(){
        area=0.0;
        volume=0.0;

    }
    public Shape(double a,double v){
        area=a;
        volume=v;
    }
    public Shape(Shape s){
        area=s.area;
        volume=s.volume;

    }
    public void getInput()
    {

    }
    @Override
    public String toString(){
        return "Area"+area+" "+volume;
    }
}
class Square extends Shape{
    private double width,length,height;
}
public class Driver2 {
    public static void main(String arg[])
    {

    }
    
}
