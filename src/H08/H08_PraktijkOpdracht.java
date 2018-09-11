package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H08_PraktijkOpdracht extends Applet {
    TextField tekstvak1, tekstvak2;
    double getal1, getal2, getal3;
    Button knop1, knop2, knop3, knop4;
    String s, text;

    public void init () {
        tekstvak1 = new TextField("", 15);
        tekstvak2 = new TextField("", 15);
        knop1 = new Button("*");
        knop1.addActionListener(new Knop1Listener());
        knop2 = new Button("/");
        knop2.addActionListener(new Knop2Listener());
        knop3 = new Button("+");
        knop3.addActionListener(new Knop3Listener());
        knop4 = new Button("-");
        knop4.addActionListener(new Knop4Listener());
        add(tekstvak1);
        add(tekstvak2);
        add(knop1);
        add(knop2);
        add(knop3);
        add(knop4);
        s = "";
    }

    public void paint (Graphics g) {
        tekstvak1.setText(" "+getal3);
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble( s );
            String text = tekstvak2.getText();
            getal2 = Double.parseDouble( text );
            getal3 = Double.parseDouble( s );
            getal3 = getal1*getal2;
            repaint();
        }
    }

    class Knop2Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble( s );
            String text = tekstvak2.getText();
            getal2 = Double.parseDouble( text );
            getal3 = Double.parseDouble( s );
            getal3 = getal1/getal2;
            repaint();
        }
    }

    class Knop3Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble( s );
            String text = tekstvak2.getText();
            getal2 = Double.parseDouble( text );
            getal3 = Double.parseDouble( s );
            getal3 = getal1+getal2;
            repaint();
        }
    }

    class Knop4Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            String s = tekstvak1.getText();
            getal1 = Double.parseDouble( s );
            String text = tekstvak2.getText();
            getal2 = Double.parseDouble( text );
            getal3 = Double.parseDouble( s );
            getal3 = getal1-getal2;
            repaint();
        }
    }
}