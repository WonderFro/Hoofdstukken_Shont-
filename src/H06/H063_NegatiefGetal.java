package H06;

import java.applet.Applet;
import java.awt.*;


public class H063_NegatiefGetal  extends Applet {
    int a, b, uitkomst;


    public void init() {
        a = 1;
        b = 1;
        uitkomst = a+b;
    }

    public void paint(Graphics g) {
        g.drawString("De uitkomst is: " + -uitkomst, 20, 20);
    }
}
