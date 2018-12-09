import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Main implements ActionListener{
    JTextField t1,t2,t3;
    JButton b1,b2,b3,b4,b5;
    Main()
    {
        JFrame f = new JFrame("Calc++ , the Calculator !");
        t1=new JTextField();
        t2=new JTextField();
        t3=new JTextField();
        b1=new JButton("+");
        b2=new JButton("-");
        b3=new JButton("x");
        b4=new JButton("/");
        b5=new JButton("%");
        t1.setBounds(50,50,150,20);
        t2.setBounds(50,100,150,20);
        t3.setBounds(50,150,150,20);
        b1.setBounds(50,200,50,50);
        b2.setBounds(120,200,50,50);
        b3.setBounds(190,200,50,50);
        b4.setBounds(260,200,50,50);
        b5.setBounds(330,200,50,50);
        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        f.setSize(1000,1000);
        f.add(t1);f.add(t2);f.add(t3);f.add(b1);f.add(b2);f.add(b3);f.add(b4);f.add(b5);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        String s1=t1.getText();
        String s2=t2.getText();
        int a=Integer.parseInt(s1);
        int b=Integer.parseInt(s2);
        int c=0;
        if(e.getSource()==b1){
            c=a+b;
        }
        else if(e.getSource()==b2){
            c=a-b;
        }
        else if(e.getSource()==b3){
            c=a*b;
        }
        else if(e.getSource()==b4){
            c=a/b;
        }
        else if(e.getSource()==b5){
            c=a%b;
        }
        String result=String.valueOf(c);
        t3.setText(result);

    }
    public static void main(String args[])
    {
        new Main();
    }
}
