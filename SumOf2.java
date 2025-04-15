import java.util.*;
class SumOf2 {
    public static void main(String args[]){
        int n,m;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter n and m ");
        n=sc.nextInt();
        m=sc.nextInt();
        System.out.println("n and m are "+n+" "+m);
        int s=n+m;
        System.out.println("Sum is "+s); // concatenate by +
        System.out.printf("Sum is %d ",s); //this is 2nd method to display

    }
    
}
