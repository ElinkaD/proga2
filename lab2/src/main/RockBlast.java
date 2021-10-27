package main;

import ru.ifmo.se.pokemon.*;

public class RockBlast extends PhysicalMove{
    public RockBlast(){super(Type.ROCK,25,90, 2,2-5);}
    public String describe() {
        return ("использует аттаку Rock Blast");
    }

}
