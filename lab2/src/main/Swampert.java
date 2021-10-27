package main;

import ru.ifmo.se.pokemon.Type;

public class Swampert extends Marshtomp{
    public Swampert(String name, int level){
        super(name,level);
        addType(Type.GROUND);
        setStats(100.0, 110.0, 90.0, 85.0, 90.0, 60.0);
        addMove(new Swagger());
    }

}
