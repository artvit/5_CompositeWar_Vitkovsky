package by.epam.compositewar.util;

import by.epam.compositewar.action.Battle;
import by.epam.compositewar.composite.Component;
import by.epam.compositewar.creation.ArmyCreator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    public static final Logger LOGGER = LogManager.getLogger();

    public static void main(String[] args) {
        ArmyCreator armyCreator = new ArmyCreator();
        Component firstArmy = armyCreator.createFirstArmy();
        LOGGER.info("First army created:\n" + firstArmy);
        Component secondArmy = armyCreator.createSecondArmy();
        LOGGER.info("Second army created:\n" + secondArmy);
        Battle battle = new Battle();
        LOGGER.info("Battle starts");
        battle.begin(firstArmy, secondArmy);
    }
}
