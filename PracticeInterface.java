interface Animal{
    void walk();

}
interface Herbivorb {
    void run();

    
}
class Dog implements Animal, Herbivorb{
    public void walk(){
        System.out.println("Dog is walking");
    }
    public void run(){
        System.out.println("Dog is running");
    }

}
public class PracticeInterface {
    public static void main(String arg[]){
        Dog d=new Dog();
        d.walk();
    }
    
}
