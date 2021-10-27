package main;

import ru.ifmo.se.pokemon.*;
public class Swagger extends StatusMove{
    public Swagger(){
        super(Type.NORMAL,0.0D, 85);
    }
    protected void applySelfEffects(Pokemon p) {
        Effect eff = new Effect().stat(Stat.ATTACK, +2);
        p.addEffect(eff);
    }
    public String describe() {
        return ("использует аттаку Rest");
    }
}
