package main;

import ru.ifmo.se.pokemon.*;

public class Cubone extends Pokemon{
    public Cubone(String name, int level){
        super(name,level);
        setType(Type.GROUND);
        setStats(50.0, 50.0, 95.0, 40.0, 50.0, 35.0);
        setMove(new Facade(), new Confide(), new DoubleTeam());
    }
}
