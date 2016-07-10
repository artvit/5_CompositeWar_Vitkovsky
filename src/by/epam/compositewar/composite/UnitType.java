package by.epam.compositewar.composite;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public enum UnitType {
    WARRIOR, DRAGON, MAGE, UNDEAD, TROLL;

    private static final List<UnitType> VALUES =
            Collections.unmodifiableList(Arrays.asList(values()));
    private static final int SIZE = VALUES.size();
    private static final Random RANDOM = new Random();

    public static UnitType randomUnitType() {
        return VALUES.get(RANDOM.nextInt(SIZE));
    }
}
