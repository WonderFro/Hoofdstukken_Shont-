package H04;

import java.awt.*;
import java.applet.*;

public class H041 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(130, 120, 200, 20);
        g.drawLine(270, 120, 200, 20);
        g.drawLine(130, 120, 270, 120);
    }
}
