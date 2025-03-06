class NewException extends Exception{
    int n;
    NewException(int i){
        n=i;

    }

    @Override
    public String toString(){
        return "New Exception "+n;

    }
}
public class CustomExce{
    public static void main(String arg[]){
        try{
            doWork(3);
            doWork(2);
            doWork(1);
            doWork(0);
        }
        catch(Exception e){
            System.out.println("Exception : "+e);

        }
    }
    static void doWork(int n) throws NewException{
        if(n==0){
            throw new NewException(n);
        }
        else{
            System.out.println("No problem");
        }
    }
}