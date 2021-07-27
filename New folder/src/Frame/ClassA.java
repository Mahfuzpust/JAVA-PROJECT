package Frame;

import java.awt.Container;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class ClassA extends JFrame {
    JLabel th;
    JButton bt;
    ImageIcon ii, ii2;
    public ClassA()
    {
        ///super("Home :: Share it Java Program... !!!");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 400);
        ///setLayout(null);
        setLocationRelativeTo(null);
        ///setResizable(false);
        /// ii = new ImageIcon("asha.jpg");
        ii2 = new ImageIcon("home.png");
       // th = new JLabel(ii);
        bt = new JButton("Home");
        bt.setIcon(ii2);
        bt.setBounds(150, 40, 100, 100);
        //Container c = this.getContentPane();
        add(bt);
       /// pack();
    }
    
}
