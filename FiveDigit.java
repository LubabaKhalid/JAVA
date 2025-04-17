public class FiveDigit {
    public static void main(String args[]){
        int n=42310;
        int[] arr;
        arr=new int[5];
        int i=0;
        while(n!=0 && i<5){
            arr[i]=n%10;
            i=i+1;
            n=n/10;
        } 
        
        for(i=0;i<5;i++){
            System.out.print(arr[i]+" "); //reversed
        }
        System.out.println();
        for(i=4;i>=0;i--){
            System.out.print(arr[i]+" "); //inorder
        }
       }
}

