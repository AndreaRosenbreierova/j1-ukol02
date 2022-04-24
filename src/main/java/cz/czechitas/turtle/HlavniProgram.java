package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void main(String[] args) {
       /* zofka.setLocation(100.0, 100.0);
        nakresliRovnostrannyTrojuhelnik(50.0);
        zofka.setLocation(200, 100);
        nakresliCtverec(50);
        zofka.setLocation(300, 100);
        nakresliObdelnik(40, 70);
        zofka.setLocation(340, 100);
        nakresliKolecko(5);
    */

        zofka.setLocation(100, 110);
        zofka.setPenColor(Color.red);
        nakresliKolecko(10);
        zofka.setLocation(228, 120);
        zofka.turnLeft(90);
        zofka.setPenColor(Color.yellow);
        nakresliRovnostrannyTrojuhelnik(130);

        zofka.setPenColor(Color.cyan);
        zofka.turnRight(90);
        zofka.setLocation(390, 100);
        nakresliKolecko(5);
        zofka.setLocation(380, 180);
        nakresliKolecko(7);
        zofka.setLocation(370, 285);
        nakresliKolecko(9);
        zofka.setLocation(350, 180);
        nakresliKolecko(2);
        zofka.setLocation(475, 180);
        nakresliKolecko(2);

        zofka.setPenWidth(5);
        zofka.setLocation(607, 200);
        zofka.setPenColor(new Color(141,74,67));
        nakresliRovnostrannyTrojuhelnik(60);
        zofka.setLocation(607,180);
        zofka.setPenColor(Color.black);
        nakresliObdelnik(60,100);
        zofka.setLocation(610, 203);
        zofka.setPenColor(Color.black);
        nakresliKolecko(3);
        zofka.setLocation(660,203);
        nakresliKolecko(3);
        zofka.setLocation(710,180);
        zofka.setPenColor(Color.black);
        nakresliObdelnik(130, 90);
        zofka.setLocation(712,180);
        zofka.setPenColor(Color.black);
        nakresliKolecko(7);
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(200);




    }


    public void nakresliRovnostrannyTrojuhelnik(double velikostStrany) {
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
        zofka.move(velikostStrany);
        zofka.turnLeft(120.0);
    }

    public void nakresliCtverec(double velikostStrany) {
        for (int i = 0; i < 4; i++) {
            zofka.move(velikostStrany);
            zofka.turnLeft(90);
        }
    }
    public void nakresliObdelnik(double velikostStranyX, double velikostStranyY ) {
        for (int i = 0; i <2; i++) {
            zofka.move(velikostStranyX);
            zofka.turnRight(90);
            zofka.move(velikostStranyY);
            zofka.turnRight(90);
        }
    }
    public void nakresliKolecko(double delkaStrany) {
        for (int i = 0; i < 40; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(9);

        }

    }
}
