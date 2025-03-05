public class DivZero {
    public static void main(String arg[]){
        int num=10;
        int den=0;
        try{
            int n=num/den;
        }
        catch(ArithmeticException e){
            System.out.println("Invalid denominator "+e);
        }
        
    }
}
