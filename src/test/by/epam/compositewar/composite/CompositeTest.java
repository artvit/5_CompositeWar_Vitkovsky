package test.by.epam.compositewar.composite;

import by.epam.compositewar.composite.Component;
import by.epam.compositewar.composite.Unit;
import by.epam.compositewar.creation.ArmyCreator;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


public class CompositeTest {
    private Component firstArmy;
    private Component secondArmy;

    @Before
    public void before() {
        ArmyCreator armyCreator = new ArmyCreator();
        firstArmy = armyCreator.createFirstArmy();
        secondArmy = armyCreator.createSecondArmy();
    }

    @Test
    public void getRandomUnitTest() {
        Unit unit = firstArmy.getRandomUnit();
        Assert.assertNotNull(unit);
    }

    @Test
    public void removeTest() {
        Unit unit = firstArmy.getRandomUnit();
        int startSize = firstArmy.size();
        firstArmy.remove(unit);
        int endSize = firstArmy.size();
        Assert.assertTrue(startSize - endSize == 1);
    }
}
