package main;

import ru.ifmo.se.pokemon.*;

public class ConfuseRay extends StatusMove {
    public ConfuseRay(){
        super(Type.NORMAL,0.0D, 100);
    }
    protected void applyOppEffects(Pokemon p){
        Effect p1 = new Effect().chance(0.33).turns(2-5);
        int current = (int) p.getHP() - 40;
        p1.stat(Stat.HP, current);
        p.addEffect(p1);
    }

    public String describe() {
        return ("использует аттаку Confuse Ray");
    }
}
