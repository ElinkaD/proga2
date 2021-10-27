package main;

import com.sun.xml.internal.bind.v2.runtime.SwaRefAdapter;
import ru.ifmo.se.pokemon.*;

public class Main {

    public static void main(String[] args) {
        Battle b = new Battle();
        Tropius Armin = new Tropius("Armin",1);
        Cubone Levi = new Cubone("Levi", 1);
        Marowak Mikasa = new Marowak("Mikasa", 1);
        Mudkip Sasha = new Mudkip("Sasha", 1);
        Marshtomp Historia = new Marshtomp("Historia", 1);
        Swampert Eren = new Swampert("Eren", 1);
        b.addAlly(Armin);
        b.addAlly(Levi);
        b.addAlly(Mikasa);
        b.addFoe(Sasha);
        b.addFoe(Historia);
        b.addFoe(Eren);
        b.go();
    }
}
