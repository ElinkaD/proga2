package main;

import ru.ifmo.se.pokemon.*;

public class Mudkip extends Pokemon {
    public Mudkip(String name, int level){
        super(name,level);
        setType(Type.WATER);
        setStats(50.0, 70.0, 50.0, 50.0, 50.0, 40.0);
        setMove(new WorkUP(), new Rest());
    }

}
