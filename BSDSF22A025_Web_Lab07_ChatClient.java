import java.io.*;
import java.net.*;

public class BSDSF22A025_Web_Lab07_ChatClient {
    public static void main(String[] args) {
        try {
            Socket socket=new Socket("localhost",1234);
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream(),true);
            BufferedReader clientInput=new BufferedReader(new InputStreamReader(System.in));
            String message;
            while (true) 
            {
                System.out.print("Client: ");
                message = clientInput.readLine();
                output.println(message);

                if (message.equalsIgnoreCase("exit")) break;

                String reply = input.readLine();
                System.out.println("Server: "+ reply);
            }
            socket.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
