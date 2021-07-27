package ananda;

import java.io.ObjectOutputStream;
import java.net.Socket;

public class ImageClient {
     
    public static void main(String[] args){
        try{
            Socket soc = new Socket("localhost", 6666);// Local Host Number
            ObjectOutputStream out = new ObjectOutputStream(soc.getOutputStream());
            out.writeUTF("Hello World\n My name is Ananda");
            out.flush();
            out.close();
            soc.close();
                    
        }
        catch(Exception e)
        {
            System.out.println(e);
        }
        
    }
    
    
}
