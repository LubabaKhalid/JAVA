import java.util.*;
public class MinMax{
    public static void main(String args[])
    {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array : ");
        int size=sc.nextInt();
        
        int[] arr=new int[size];
        System.out.print("Enter elements of array : ");
        for(int i=0;i<size;i++)
        {
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of array are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(arr[i]+" ");
        }
        int min=arr[0];
        int max=arr[0];
        for(int i=1;i<size;i++)
        {
            if(min>arr[i])
                min=arr[i];
            if(max<arr[i])
                max=arr[i];
        }
        System.out.print("\n");
        System.out.println("Minimun value is : "+min);
        System.out.println("Maximum value is : "+max);


    }

}