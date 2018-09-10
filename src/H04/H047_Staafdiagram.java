package H04;

import java.awt.*;
import java.applet.*;

public class H047_Staafdiagram extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.green);
        g.fillRect(200, 210, 40, 90);

        g.setColor(Color.red);
        g.fillRect(300, 95, 40, 205);

        g.setColor(Color.blue);
        g.fillRect(400, 130, 40, 170);

        g.setColor(Color.black);
        g.drawLine(185, 300, 440, 300);
        g.drawLine(185, 300, 185, 0);

        g.drawString("Valerie", 200 , 325 );
        g.drawString("Jeroen", 300 , 325 );
        g.drawString("Hans", 405 , 325 );

        g.drawString("0", 172 , 300 );
        g.drawString("100", 165 , 100 );
        g.drawString("20", 170 , 260 );
        g.drawString("40", 170 , 220 );
        g.drawString("60", 170 , 180 );
        g.drawString("80", 170 , 140 );
    }
}