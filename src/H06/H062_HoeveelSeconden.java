package H06;

import java.applet.Applet;
import java.awt.*;


public class H062_HoeveelSeconden  extends Applet {
    int a, b, c, d, e, uitkomst, uitkomst1, uitkomst2, uitkomst3;


    public void init() {
        a = 60;
        b = 60;
        c = 3600;
        d = 24;
        e = 365;
        uitkomst = (a*b);
        uitkomst1 = (c*d);
        uitkomst2 = ((c*d)*e);
    }

    public void paint(Graphics g) {
        g.drawString("Aantal seconden in een uur: " + uitkomst, 20, 20);
        g.drawString("Aantal seconden in een dag: " + uitkomst1, 20, 40);
        g.drawString("Aantal seconden in een jaar: " + uitkomst2, 20, 60);
    }
}