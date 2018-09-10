package H06;

import java.applet.Applet;
import java.awt.*;


public class H061_GeldDelen  extends Applet {
    double a, b, uitkomst;


    public void init() {
        a = 113;
        b = 4;
        uitkomst = a/b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
        g.drawString("€28,25:   Jan", 20, 60);
        g.drawString("€28,25:   Ali", 20, 80);
        g.drawString("€28,25:   Jeanette", 20, 100);
        g.drawString("€28,25:   Shonté", 20, 120);
    }
}








