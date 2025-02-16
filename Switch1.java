import java.util.*;
public class Switch1 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        sc.nextLine();
        String op=sc.nextLine();
        switch(op){
            case "+":{
                System.out.print(a+b);
                break;
            }
            case "-":
            {
                System.out.print(a-b);
                break;
            }
            case "*":
            {
                System.out.print(a*b);
                break;
            }
            case "/":
            {
                System.out.print(a/b);
                break;
            }
            case "%":
            {
                System.out.print(a%b);
                break;
            }
            default:
            System.out.print("Invalid input");
        }
    }
}
