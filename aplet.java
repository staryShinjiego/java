import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

import.javax.swing.JFrame;
import.javax.swing.JPanel;
import.javax.swing.JButton;

public class aplet{
    public static void main(String[] args){
        JFrame ramka = new JFrame();
        ramka.setSize(width:900, height:600);
        ramka.setDefaultCloseOperation(JFrame.EXIT_0N_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,hgap:10,vgap:10));

        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        panel.setBackground(Color.gray);
        panel.setPreferredSize(new Dimension(width:600,height:500));

        Scanner scanner = new scanner(System.in);

        JButton wynik = new JButton();
        wynik.setText(text:"ok");

        panel.add(wynik);
        ramka.setVisible(b:true);
        ramka.add(panel);
    }
}
