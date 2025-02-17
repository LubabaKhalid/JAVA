import java.util.*;
public class Armstrong {
    public static void main(String arg[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.print("0 is starting number and Enter ending number : ");
        int end =sc.nextInt();
        if(end<0){
            System.out.print("Invalid input");
        }
        else{
            ArrayList<Integer> ar=new ArrayList<>();
            for(int i=0;i<=end;i++)
            {
                int sum=0;
                int num=i;
                while(num>0){
                num=i;
                int d=num%10;
                sum=sum+(d*d*d);
                num=num/10;
            }
            if(sum==i)
            {
                ar.add(i);
               
            }
            }

            
            System.out.print(ar);
            
        }

    }
    
}
