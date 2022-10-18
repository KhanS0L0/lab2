
import Pokemons.*;
import ru.ifmo.se.pokemon.Battle;

public class Main {
    public static void main(String[] args) {
        Battle b = new Battle();
        Togedemaru p1 = new Togedemaru("Владимир", 1);
        Swadloon p2 = new Swadloon("Агафья", 1);
        Surskit p3 = new Surskit("Есения", 1);
        Sewaddle p4 = new Sewaddle("Радомир", 1);
        Masquerain p5 = new Masquerain("Добрыня", 1);
        Leavanny p6 = new Leavanny("Кристель", 1);

        b.addAlly(p1);
        b.addAlly(p2);
        b.addAlly(p3);
        b.addFoe(p4);
        b.addFoe(p5);
        b.addFoe(p6);
        b.go();
    }
}


