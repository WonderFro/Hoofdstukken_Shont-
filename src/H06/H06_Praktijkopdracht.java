package H06;

import java.applet.Applet;
import java.awt.*;


public class H06_Praktijkopdracht<gebroken, geheel> extends Applet {
    double a, b, c, d, uitkomst;


    public void init() {
        a = 5.9;
        b = 6.3;
        c = 6.9;
        d = 3;
        uitkomst = (a+b+c)/d;
    }


    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + uitkomst, 20, 20);
    }
}