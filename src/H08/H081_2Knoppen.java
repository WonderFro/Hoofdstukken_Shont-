package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H081_2Knoppen extends Applet {
    TextField tekstvak;
    Label label;
    double getal;
    Button knop, knop1;
    String s, text;

    public void init () {
        tekstvak = new TextField("", 20);
        label = new Label("Type een getal");
        knop = new Button("Ok");
        knop.addActionListener(new KnopListener ());
        knop1 = new Button("Reset");
        knop1.addActionListener(new Knop1Listener ());
        add(label);
        add(tekstvak);
        add(knop);
        add(knop1);

        s = "";
    }

    public void paint (Graphics g) {
        g.drawString(text, 50, 60);
    }

    class KnopListener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            text = s;
            repaint();
        }
    }

    class Knop1Listener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            text = " ";
            tekstvak.setText(" ");
            repaint();
        }
    }
}