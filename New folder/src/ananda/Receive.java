package ananda;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Receive extends JFrame {
    
     JLabel an, hm, mh, th;
    JButton home, back;
    ImageIcon i1, i2, i3;
    
    public Receive()
    {
        super("Recevied.....!!!");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);
        JLabel an = new JLabel("1. Md Ananda Mia ");
        Font font = new Font("Arial", Font.BOLD, 25);
        an.setFont(font);
        an.setBounds(10, 20, 400, 30);
        add(an);
        
        JLabel mh = new JLabel("2. Roll : 180134 ");
        Font font1 = new Font("Arial", Font.BOLD, 25);
        mh.setFont(font1);
        mh.setBounds(10, 60, 400, 30);
        add(mh);
        
        JLabel hm = new JLabel("3. Roll : 180133 ");
        Font font2 = new Font("Arial", Font.BOLD, 25);
        hm.setFont(font2);
        hm.setBounds(10, 100, 400, 30);
        add(hm);
        
        i3 = new ImageIcon("thank.png");
        JLabel th = new JLabel("------ Thank You------");
        Font font3 = new Font("Arial", Font.BOLD, 20);
        th.setFont(font3);
        th.setIcon(i3);        
        th.setBounds(80, 240, 400, 30);
        add(th);
        
        
        
        
        
        
        
        i1 = new ImageIcon("home.png");
        JButton home = new JButton("Home");
        home.setIcon(i1);
        home.setBounds(260, 280, 120, 50);
        add(home);    
        home.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
       i2 = new ImageIcon("Back2.png");
        JButton back = new JButton("Back");
        back.setIcon(i2);
        back.setBounds(10, 280, 120, 50);
        add(back);       
        
        back.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent ae) {
               new Introduce();
               setVisible(false);
            }
        });
        
        
        
         Container con = getContentPane();
         con.setBackground(Color.GREEN);
    }
    
    
}
