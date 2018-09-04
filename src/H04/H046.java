package H04;

import java.awt.*;
import java.applet.*;

public class H046 extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
        setBackground(Color.blue);
        g.setColor(Color.yellow);

        g.fillArc(120, 100, 150, 100, 90, 360);
    }
}