package ananda;

import Socket.MyClient;
import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Send extends JFrame{
    JButton home, back, file, image, audio, vedio;
    ImageIcon i1, i2, fl, img, ad, vd;
    public Send(){
        super("Select The Options...");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        
        i1 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i1);
        home.setBounds(260, 300, 120, 50);
        add(home);    
        
        i2 = new ImageIcon("Back2.png");
        JButton back = new JButton("Back");
        back.setIcon(i2);
        back.setBounds(10, 300, 120, 50);
        add(back); 
        
        home.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        
        back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Project();
               setVisible(false);
            }
        });
        
        fl = new ImageIcon("file.png");
        JButton file = new JButton("File");
        file.setIcon(fl);
        file.setBounds(140, 30, 120, 50);
        add(file);
        
        img = new ImageIcon("image.png");
        JButton image = new JButton("Image");
         image.setIcon(img);
        image.setBounds(140, 100, 120, 50);
        add(image);
        
        ad = new ImageIcon("audio.png");
        JButton audio = new JButton("Audio");
        audio.setIcon(ad);
        audio.setBounds(140, 170, 120, 50);
        add(audio);
        
        vd = new ImageIcon("vedio.png");
        JButton vedio = new JButton("Vedio");
        vedio.setIcon(vd);
        vedio.setBounds(140, 240, 120, 50);
        add(vedio);
        
         file.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                setVisible(false);
               new FileServer().main(null);
              /// new FileClient().main(null);
              /// setVisible(false);
            }
        });
        
        
        image.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new ImageServer().main(null);
               ///new ImageClient().main(null);
               setVisible(false);
            }
        });
        
         audio.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println("Work on this page is underway");
               ///setVisible(false);
            }
        });
        
        
        vedio.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                System.out.println("Work on this page is underway"); 
               ///setVisible(false);
            }
        });
        
         Container con = getContentPane();
         con.setBackground(Color.GREEN);
        
    }
        
}
