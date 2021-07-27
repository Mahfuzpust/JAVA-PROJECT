package ananda;

import java.io.FileOutputStream;
import java.io.InputStream;
import java.net.Socket;

public class FileClient {
    
    public static void main(String[] args){
        
        try{
           
            Socket soc = new Socket("localhost", 2000);
            InputStream st = soc.getInputStream();
            FileOutputStream fr = new FileOutputStream("F:\\fac.txt");
            byte b[] = new byte[20000];
            st.read(b, 0, b.length);
            fr.write(b, 0, b.length);
            
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
}
