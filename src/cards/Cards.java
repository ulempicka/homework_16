package cards;

import java.util.List;

public enum Cards {
    CLUBS("Trefl"),          //zoledzie
    DIAMONDS("Karo"),        //dzwonek
    HEARTS("Kier"),          //serce
    SPADES("Pik");           //wino

    private final String polish;

    Cards(String polish) {
        this.polish = polish;
    }

}
