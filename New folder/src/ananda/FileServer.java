package ananda;
import java.net.*;
import java.io.*;


public class FileServer {
    
    public static void main(String[] args){
        try{
        ///new Send().setVisible(false);
       /// new FileClient().main(null);
        ServerSocket sos = new ServerSocket(2000);
        Socket soc = sos.accept();
        System.out.println("Connected !!!");
        FileInputStream fr = new FileInputStream("G:\\abc.txt");
        byte b[] = new byte[20000];
        fr.read(b, 0, b.length);
        OutputStream os = soc.getOutputStream();
        os.write(b, 0, b.length);
        new FileClient().main(null);
       // new FileClient();       
        }
        catch(Exception e){
            System.out.println(e);
        }        
        
    }
    
}
