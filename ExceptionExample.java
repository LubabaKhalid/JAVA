import java.lang.reflect.Executable;
import java.security.PublicKey;
class CusExceptionNew extends Exception{
    int n;
    int d;
   CusExceptionNew(int n,int d){
    this.n=n;
    this.d=d;

   } 
   public String toString(){
    return "This is not valid because its reminder is not zero of "+ this.n +" and "+ this.d;
   }
}
public class ExceptionExample {
    public static void main(String arg[]){
        int num[]={4,6,0,1};
        int[] den={2,3,7,8};
        for(int i=0;i<4;i++){
            try{
                if(num[i]%den[i]!=0 ) throw new CusExceptionNew(num[i],den[i]);
                else{
                    System.out.println(num[i]+" % "+den[i]+" = "+num[i]%den[i]);
                }
            }
            catch(CusExceptionNew e){
                System.out.println(e);
            }
            
        }
    }
}
