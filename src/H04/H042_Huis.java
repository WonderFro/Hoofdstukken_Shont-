package H04;

import java.awt.*;
import java.applet.*;

public class H042_Huis extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawRect(130, 120, 140, 120);
        g.drawRect(155, 150, 40, 40);
        g.drawRect(210, 180, 40, 60);

        g.drawLine(130, 120, 200, 20);
        g.drawLine(270, 120, 200, 20);
        g.drawLine(130, 120, 270, 120);

    }
}
