import java.lang.reflect.Array;

public class Excep{
    public static void main(String args[]){
        try{
            int[] a=new int[100];
            a[100]=23;
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("You are using out of bound index you should use 0 to 99 index "+e);
        }
        catch (Exception ex){
            System.out.println("Parent exception class ");
        }
        
        
    }
}