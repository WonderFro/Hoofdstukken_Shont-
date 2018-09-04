package H04;

import java.awt.*;
import java.applet.*;

public class H045 extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRoundRect(110, 70, 170, 170, 10, 10);;

        g.fillOval(130, 90, 50, 50);
        g.fillOval(210, 90, 50, 50);
        g.fillOval(130, 170, 50, 50);
        g.fillOval(210, 170, 50, 50);


    }
}