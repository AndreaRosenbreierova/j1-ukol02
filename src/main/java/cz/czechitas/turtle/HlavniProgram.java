package cz.czechitas.turtle;

import cz.czechitas.turtle.engine.*;

public class HlavniProgram {
    Turtle zofka = new Turtle();

    public void main(String[] args) {
        zofka.setLocation(100.0, 100.0);
        nakresliRovnostrannyTrojuhelnik(50.0);
        zofka.setLocation(200, 100);
        nakresliCtverec(50);
        zofka.setLocation(300, 100);
        nakresliObdelnik(40, 70);
        zofka.setLocation(340, 100);
        nakresliKolecko(5);
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
            zofka.turnLeft(90);
            zofka.move(velikostStranyY);
            zofka.turnLeft(90);
        }
    }
    public void nakresliKolecko(double delkaStrany) {
        for (int i = 0; i < 40; i++) {
            zofka.move(delkaStrany);
            zofka.turnRight(9);

        }

    }
}
