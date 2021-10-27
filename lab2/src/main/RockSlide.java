package main;

import ru.ifmo.se.pokemon.*;

public class RockSlide extends PhysicalMove {
    public RockSlide(){
        super(Type.ROCK,75,90);
    }
    //protected void applyOppEffects(Pokemon var1) {
       // Effect eff = new Effect().chance(0.3).condition(Status.flinch);
       //var1.addEffect(eff);
    //}
    public String describe() {
        return ("использует аттаку Rock Slide");
    }
}
