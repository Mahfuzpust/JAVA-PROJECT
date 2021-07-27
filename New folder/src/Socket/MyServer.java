package Socket;

import java.net.*;
import java.io.*;

public class MyServer {
    
    public static void main(String[] args){
        
        try{
            
            ServerSocket sos = new ServerSocket(6666); /// Port Number
            Socket soc = sos.accept();
            System.out.println("Connected");
            BufferedReader in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            int num = Integer.parseInt(in.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println("This Number = "+num);
            System.out.println();
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
}
