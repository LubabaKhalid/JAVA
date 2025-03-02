abstract class Animal{
    Animal(){
        System.out.println("Animal Constructor ");
    }
    //abstract void walk();
    void eat(){
        System.out.println("Eating");
    }

}
class Dog extends Animal{
    public void walk(){
        System.out.println("Dog is running");
    }

}
class Cat extends Animal{
    public void walk(){
        System.out.println("Cat is walking");
    }

}

interface Shape {
    //public void draw();
    
}
class Circle implements Shape{

    public void draw(){
        System.out.println("Drawing circle");
    }

}





public class AbstractInterface {
    public static void main(String arg[]){
        Dog d=new Dog();
        Circle c=new Circle();
        c.draw();

    }
}
