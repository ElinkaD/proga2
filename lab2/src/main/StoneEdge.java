package main;

import ru.ifmo.se.pokemon.*;

public class StoneEdge extends PhysicalMove {
    public StoneEdge(){
        super(Type.ROCK,100,80);
    }
    public String describe() {
        return ("использует аттаку Stone Edge");
    }
}
