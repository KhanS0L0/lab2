package Pokemons;

import Moves.Leavanny.AerialAce;
import Moves.Sewaddle.*;
import Moves.Swadloon.GrassWhistle;
import ru.ifmo.se.pokemon.*;

public class Leavanny extends Swadloon{
    public Leavanny(String name, int level){
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(75, 103, 80, 70, 80, 92);
        Facade facade = new Facade(70,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        GrassWhistle grassWhistle = new GrassWhistle(0,55);
        AerialAce aerialAce = new AerialAce(60,0);
        super.setMove(facade, doubleTeam, grassWhistle, aerialAce);



    }
}
