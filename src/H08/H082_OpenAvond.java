package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H082_OpenAvond extends Applet {
    Label label;
    int getal, getal1, getal2, getal3;
    Button knop, knop1, knop2, knop3;
    String s, text;

    public void init () {
        knop = new Button("Man");
        knop.addActionListener(new KnopListener ());
        knop1 = new Button("Vrouw");
        knop1.addActionListener(new Knop1Listener ());
        knop2= new Button("Mannelijke leerling");
        knop2.addActionListener(new Knop2Listener ());
        knop3= new Button("Vrouwelijke leerling");
        knop3.addActionListener(new Knop3Listener ());
        add(knop);
        add(knop1);
        add(knop2);
        add(knop3);
        s = "";
    }

    public void paint (Graphics g) {
        g.drawString("Man: " + getal, 50, 60);
        g.drawString("Vrouw: " + getal1, 50, 70);
        g.drawString("Mannelijke leerling: " + getal2, 50, 80);
        g.drawString("Vrouwelijke Leerling: " + getal3, 50, 90);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            getal = 0 + getal;
            getal++;
            repaint();
        }
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            getal1 = 0 + getal1;
            getal1++;
            repaint();
        }
    }
    class Knop2Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            getal2 = 0 + getal2;
            getal2++;
            repaint();
        }
    }
    class Knop3Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            getal3 = 0 + getal3;
            getal3++;
            repaint();
        }
    }
}