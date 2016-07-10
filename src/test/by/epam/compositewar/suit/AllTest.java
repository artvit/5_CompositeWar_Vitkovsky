package test.by.epam.compositewar.suit;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import test.by.epam.compositewar.action.BattleTest;
import test.by.epam.compositewar.composite.CompositeTest;

@Suite.SuiteClasses( { BattleTest.class, CompositeTest.class} )
@RunWith(Suite.class)
public class AllTest {

}

