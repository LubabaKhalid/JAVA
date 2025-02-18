import java.util.*;
public class FirstN {
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        int s=0;
        while(i<=n)
        {
            s=s+i;
            i=i+1;
        }
        System.out.println(s);
    }
}
