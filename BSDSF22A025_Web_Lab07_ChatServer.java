import java.io.*;
import java.net.*;

public class BSDSF22A025_Web_Lab07_ChatServer {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket=new ServerSocket(1234);
            Socket socket=serverSocket.accept();
            BufferedReader input=new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter output=new PrintWriter(socket.getOutputStream(), true);
            BufferedReader serverInput=new BufferedReader(new InputStreamReader(System.in));
            String message;
            while (true) 
            {
                message=input.readLine();
                if (message.equalsIgnoreCase("exit")) break;

                System.out.println("Client: " + message);
                System.out.print("Server: ");
                String reply = serverInput.readLine();
                output.println(reply);
            }

            socket.close();
            serverSocket.close();
        } 
        catch (IOException e) 
        {
            e.printStackTrace();
        }
    }
}
