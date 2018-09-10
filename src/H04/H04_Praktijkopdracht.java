package H04;

import java.awt.*;
import java.applet.*;

public class H04_Praktijkopdracht extends Applet {

    public void init () {
    }

    public void paint (Graphics g) {
        setBackground(Color.white);
        g.setColor(Color.black);
        g.drawLine(50, 50, 200, 50);
        g.drawRect(50, 90, 150, 80);
        g.drawRoundRect(50, 200, 150, 80, 30, 30);

        g.setColor(Color.magenta);
        g.fillRect(220, 90, 150, 80);
        g.fillArc(220, 200, 150, 80, 30, 360);
        g.fillArc(390, 90, 150, 80, 0, 45);

        g.setColor(Color.black);
        g.drawArc(220, 90, 150, 80, 30, 360);
        g.drawArc(390, 90, 150, 80, 30, 360);
        g.drawOval(423, 200, 80, 80);

        g.setColor(Color.black);
        g.drawString("Lijn", 115 , 70 );
        g.drawString("Rechthoek", 100, 185 );
        g.drawString("Afgeronde rechthoek", 70, 295 );
        g.drawString("gevulde rechthoek met ovaal", 215, 185 );
        g.drawString("Gevulde ovaal", 255, 295 );
        g.drawString("Taartpunt met ovaal eromheen", 390, 185 );
        g.drawString("Cirkel", 450, 295 );

    }
}