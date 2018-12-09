import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.plaf.BorderUIResource;

public class Wcount implements ActionListener {
    JLabel l1,l2;
    JTextArea a;
    JButton b;
    Wcount()
    {
        JFrame f= new JFrame("Simplest Word Count Tool EVER ....");
        l1=new JLabel();
        l2=new JLabel();
        l1.setBounds(50,25,250,30);
        l2.setBounds(200,25,250,30);
        a=new JTextArea();
        a.setBounds(20,75,500,500);
        a.setBackground(Color.cyan);
        b=new JButton("Tell me count of words");
        b.setBounds(100,600,200,30);
        b.addActionListener(this);
        f.add(l1);f.add(l2);f.add(b);f.add(a);
        f.setSize(700,700);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        String t = a.getText();
        String words[]=t.split("\\s");
        l1.setText("No. of words : "+words.length);
        l2.setText("No. of characters : "+t.length());
    }
    public static void main(String args[])
    {
        new Wcount();
    }

}
