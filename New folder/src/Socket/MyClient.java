package Socket;

import java.io.*;
import java.net.Socket;

public class MyClient {
    
    public static void main(String[] args){
        try{
            Socket soc = new Socket("111.0.0.1", 6666);// Local Host Number
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Enter The Number : ");
            int number = Integer.parseInt(input.readLine());
            PrintWriter out = new PrintWriter(soc.getOutputStream(), true);
            out.println(number);
            BufferedReader in;
            in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
            System.out.println(in.readLine());
            
                      
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
}
