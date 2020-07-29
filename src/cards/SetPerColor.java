package cards;

import java.util.ArrayList;
import java.util.List;

public enum SetPerColor {
    SET(new int[]{2, 3, 4, 5, 6, 7, 8, 9, 10}, new String[]{"walet", "dama", "król", "as"});

    private final int[] numbers;
    private final String[] figures;

    SetPerColor(int[] numbers, String[] figures) {
        this.numbers = numbers;
        this.figures = figures;
    }
}
