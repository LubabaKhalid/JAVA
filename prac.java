import java.util.*;
/*public class prac {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("ENter size of array : ");
        int size=sc.nextInt();
        int[] ar=new int[size];
        for(int i=0;i<size;i++){
            ar[i]=sc.nextInt();
        }
        System.out.print("Elements of array are : ");
        for(int i=0;i<size;i++)
        {
            System.out.print(" "+ar[i]);
        }
    }
}*/
/*public class prac{
    public static void main(String arg[])
    {
        int payAmount=2000;
        int payPeriods=12;
        int annualPay=0;
        annualPay=payAmount*payPeriods;
        System.out.println("Total annual pay is : "+annualPay);
    }

}*/

public class prac{
    String name="";
    int year=0;
    int price=0;
    int n=0;
    
    public void Display(){
        Scanner sc=new Scanner(System.in);
        name=sc.nextLine();
        year=sc.nextInt();
        price=sc.nextInt();
        n=sc.nextInt();
        System.out.println(n+year+" "+price+" "+name);

    }
    public static void main(String arg[])
    {
        prac o=new prac();
        o.Display();
    }
}
