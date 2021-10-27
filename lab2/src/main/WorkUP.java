package main;

import ru.ifmo.se.pokemon.*;
public class WorkUP extends StatusMove {
    public WorkUP(){
        super(Type.NORMAL,0.0D, 1.0D);
    }
    protected void applyOppEffects(Pokemon var1) {
        Effect eff = new Effect().stat(Stat.ATTACK, +1);
        eff.stat(Stat.SPECIAL_ATTACK,+1);
        var1.addEffect(eff);
    }
    public String describe() {
        return ("использует аттаку Work Up");
    }
}
