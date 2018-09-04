import java.awt.*;
import java.applet.*;

public class H043 extends Applet {

    public void init() {
    }

    public void paint(Graphics g) {
        setBackground(Color.white);

        g.setColor(Color.black);
        g.drawRect(80, 80, 100, 20);

        g.setColor(Color.red);
        g.fillRect(80, 60, 101, 20);

        g.setColor(Color.blue);
        g.fillRect(80, 100, 101, 20);

        g.setColor(Color.black);
        g.fillRect(80, 120, 5, 80);


    }
}
