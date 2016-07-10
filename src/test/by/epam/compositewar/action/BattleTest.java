package test.by.epam.compositewar.action;

import by.epam.compositewar.action.Battle;
import by.epam.compositewar.composite.Component;
import by.epam.compositewar.creation.ArmyCreator;
import org.junit.Before;
import org.junit.Test;

public class BattleTest {
    private Component firstArmy;
    private Component secondArmy;

    @Before
    public void before() {
        ArmyCreator armyCreator = new ArmyCreator();
        firstArmy = armyCreator.createFirstArmy();
        secondArmy = armyCreator.createSecondArmy();
    }

    @Test(timeout = 1000)
    public void beginTest() {
        new Battle().begin(firstArmy, secondArmy);
    }
}
