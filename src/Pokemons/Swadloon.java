package Pokemons;

import Moves.Sewaddle.*;
import Moves.Swadloon.*;
import ru.ifmo.se.pokemon.*;

public class Swadloon extends Sewaddle{
    public Swadloon(String name, int level){
        super(name, level);
        super.setType(Type.BUG, Type.GRASS);
        super.setStats(55, 63, 90, 50, 80, 42);
        Facade facade = new Facade(70,100);
        DoubleTeam doubleTeam = new DoubleTeam(0,0);
        GrassWhistle grassWhistle = new GrassWhistle(0,55);
        super.setMove(facade, doubleTeam, grassWhistle);

    }
}
