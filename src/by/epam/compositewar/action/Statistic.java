package by.epam.compositewar.action;

import by.epam.compositewar.composite.Component;

public class Statistic {
    private int firstArmyStartSize;
    private int secondArmyStartSize;
    private Component firstArmy;
    private Component secondArmy;

    public Statistic(Component firstArmy, Component secondArmy) {
        this.firstArmyStartSize = firstArmy.size();
        this.secondArmyStartSize = secondArmy.size();
        this.firstArmy = firstArmy;
        this.secondArmy = secondArmy;
    }

    @Override
    public String toString() {
        int firstArmyEndSize = firstArmy.size();
        int secondArmyEndSize = secondArmy.size();
        return "Statistic:\n" +
                "  First Army Start Size: " + firstArmyStartSize + "\n" +
                "  First Army End Size: " + firstArmyEndSize + "\n" +
                "  First Army Killed Units: " + (firstArmyStartSize - firstArmyEndSize) + "\n" +
                "  Second Army Start Size: " + secondArmyStartSize + "\n" +
                "  Second Army End Size: " + secondArmyEndSize + "\n" +
                "  Second Army Killed Units: " + (secondArmyStartSize - secondArmyEndSize) + "\n";
    }
}
