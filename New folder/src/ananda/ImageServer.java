package ananda;

import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ImageServer {
    
    public static void main(String[] args){
        
        try{
            new ImageClient().main(null);
            
            ServerSocket sos = new ServerSocket(6666); /// Port Number
            Socket soc = sos.accept();
            ObjectInputStream ois = new ObjectInputStream(soc.getInputStream());
            String str = (String)ois.readUTF();
            System.out.println("Receive : "+str);
            sos.close();
            ///new ImageClient().main(null);
            
        }catch(Exception e)
        {
            System.out.println(e);
        }
    }
    
    
}
