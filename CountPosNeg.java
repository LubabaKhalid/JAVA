import java.util.*;
public class CountPosNeg {
    public static void main(String arg[]){
        int[] arr;
        arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        int p=0;
        int n=0;
        int z=0;
        for(int j=0;j<5;j++){
            if(arr[j]==0){
                z=z+1;
            }
            else if(arr[j]>0)
            {
                p=p+1;
            }
            else
            {
                n=n+1;
            }

        }
        System.out.println("Positive :"+p+" Negative : "+n+" Zeros : "+z);
    }
}
