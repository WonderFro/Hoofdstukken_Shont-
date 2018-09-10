package H08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;

public class H083_BTW extends Applet {
    TextField tekstvak;
    Label label;
    double getal, num;
    Button knop;
    String s, text;

    public void init () {
        tekstvak = new TextField(" ", 20);
        tekstvak.addActionListener(new Tekstvaklistener ());
        label = new Label("BTW berekenen");

        add(label);
        add(tekstvak);

        s = "";
    }

    public void paint (Graphics g) {
        g.drawString("Inclusief BTW: " + getal, 50, 60);
    }

    class Tekstvaklistener implements ActionListener {
        public void actionPerformed (ActionEvent e) {
            s = tekstvak.getText();
            num = Double.parseDouble( s );
            getal = Double.parseDouble( s );
            getal = num*1.21;
            repaint();
        }
    }
}
