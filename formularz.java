//package jawa_gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class formularz {
    public static void main(String[] args){
        //Frame:
        JFrame ramka = new JFrame();
        ramka.setSize(900, 600); 
        ramka.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ramka.setLayout(new FlowLayout(FlowLayout.CENTER,10,10));
  
        JPanel panel_aplikacji = new JPanel();
        panel_aplikacji.setLayout(new FlowLayout());
        panel_aplikacji.setBackground(Color.gray);
        panel_aplikacji.setPreferredSize(new Dimension(1000,800));

        JTextArea imie = new JTextArea();
        imie.setText("Darek");
        JTextArea nazwisko = new JTextArea();
        nazwisko.setText("Kowalski");

        JCheckBox checkBox1 = new JCheckBox("Kobieta");  
        checkBox1.setBounds(100,100, 50,50);  
        JCheckBox checkBox2 = new JCheckBox("Mężczyna");  
        checkBox2.setBounds(100,150, 50,50);  

        JButton baton = new JButton("Zatwierdź dane");


        ramka.setVisible(true); 
        ramka.add(panel_aplikacji); 
        panel_aplikacji.add(imie);
        panel_aplikacji.add(nazwisko);
        panel_aplikacji.add(checkBox1);  
        panel_aplikacji.add(checkBox2);  
        panel_aplikacji.add(baton);
    }
}