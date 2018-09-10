package H05;

import java.awt.*;
import java.applet.*;

public class H051_Staafdiagram_2 extends Applet {

    //declaratie.
    Color opvulkleur;
    Color lijnkleur;
    int breedte;
    int hoogte;

    public void init () {
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
    }

    public void paint(Graphics g) {
        int Valerie = 40;
        int Jeroen  = 100;
        int Henk    = 80;

        g.fillRect(150,20,40,Valerie);
        g.fillRect(250,20,40,Jeroen);
        g.fillRect(350,20,40,Henk);

        g.drawString("Valerie", 150,15);
        g.drawString("Jeroen", 250,15);
        g.drawString("Henk", 355,15);

        g.drawString("0kg", 100,20);
        g.drawString("20kg", 100,40);
        g.drawString("40kg", 100,60);
        g.drawString("60kg", 100,80);
        g.drawString("80kg", 100,100);
        g.drawString("100kg", 100,120);
    }
}






