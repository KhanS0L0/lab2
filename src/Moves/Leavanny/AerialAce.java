package Moves.Leavanny;


import ru.ifmo.se.pokemon.*;


public class AerialAce extends PhysicalMove {
    public AerialAce(double pow, double acc) {
        super(Type.FLYING, pow, acc);
    }
    @Override
    protected boolean checkAccuracy(Pokemon att, Pokemon deff){
        return true;
    }
    @Override
    protected String describe(){
        String[] pieces = this.getClass().toString().split("\\.");
        return "применил " + pieces[pieces.length-1];
    }
}
