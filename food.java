import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class food extends JFrame implements ActionListener {
    JLabel l;
    JCheckBox c1,c2,c3,c4;
    JButton b;
    food()
    {
        l=new JLabel("BhojanYantram , order best quality food at your doorstep !");
        l.setBounds(50,50,550,20);
        c1 = new JCheckBox("Healthy Combo(Sprouts+Lassi+Milk & Cornflakes/Dalia) @90");
        c2 = new JCheckBox("Hungrier's Combo(Samosa+Sweet+Frooti+Cutlet) @100");
        c3 = new JCheckBox("Golgappe @30");
        c4 = new JCheckBox("Coffee/Tea @15");
        c1.setBounds(100,100,500,20);
        c2.setBounds(100,150,500,20);
        c3.setBounds(100,200,400,20);
        c4.setBounds(100,250,400,20);
        b = new JButton("Order now");
        b.setBounds(100,300,200,20);
        b.addActionListener(this);
        add(l);add(c1);add(c2);add(c3);add(c4);
        add(b);
        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }
    public void actionPerformed(ActionEvent e)
    {
        float tot=0;
        String m="";
        if(c1.isSelected())
        {
            tot+=90;
            m+="Healthy Combo : 90\n";
        }
        if(c2.isSelected()) {
            tot += 100;
            m+= "Hungrier's Combo : 100\n";
        }
        if(c3.isSelected()) {
            tot += 30;
            m+= "Golgappe : 30\n";
        }
        if(c4.isSelected()) {
            tot += 15;
            m += "Tea/Coffee :15\n";
        }
        m+="~~~~~~~~~~~~~~~~~~~~~~~~~~~\n";
        JOptionPane.showMessageDialog(this,m+"Total amount :"+tot);
    }
    public static void main(String args[])
    {
        new food();
    }
}
