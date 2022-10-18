package Pokemons;
import Moves.Togedemaru.*;
import ru.ifmo.se.pokemon.*;



public class Togedemaru extends Pokemon{
    public Togedemaru(String name, int level){
        super(name, level);
        super.setType(Type.ELECTRIC, Type.STEEL);
        super.setStats(65, 98, 63, 40, 73, 96);
        FocusBlast focusBlast = new FocusBlast(120, 70);
        BulkUp bulkUp = new BulkUp(0,0);
        WorkUp workUp = new WorkUp(0,0);
        IronDefense ironDefense = new IronDefense(0, 0);
        super.setMove(focusBlast, bulkUp, workUp, ironDefense);


    }
}
