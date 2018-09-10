package H04;

import java.awt.*;
import java.applet.*;

public class H044_Stoplicht extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.fillRect(150, 70, 110, 190);

        g.setColor(Color.red);
        g.fillOval(180, 80, 50, 50);

        g.setColor(Color.yellow);
        g.fillOval(180, 140, 50, 50);

        g.setColor(Color.green);
        g.fillOval(180, 200, 50, 50);

    }
}