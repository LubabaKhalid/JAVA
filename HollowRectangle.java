import java.util.*;
public class HollowRectangle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        for(int i=0;i<x;i++)
        {
            System.out.print("*");
            for(int j=2;j<y;j++)
            {
                if(i==0 || i==(x-1))
                {
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println("*");
        }
    }
}
