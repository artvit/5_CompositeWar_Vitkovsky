package by.epam.compositewar.action;

import by.epam.compositewar.composite.Component;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Battle {
    private static final Logger LOGGER = LogManager.getLogger();

    public void begin(Component firstArmy, Component secondArmy) {
        Statistic statistic = new Statistic(firstArmy, secondArmy);
        while (firstArmy.size() > 0 && secondArmy.size() > 0) {
            LOGGER.info("First army attacks the second one");
            firstArmy.assault(secondArmy);
            if (secondArmy.size() > 0) {
                LOGGER.info("Second army attacks the first one");
                secondArmy.assault(firstArmy);
            }
        }
        if (firstArmy.size() > 0) {
            LOGGER.info("First army wins");
        } else {
            LOGGER.info("Second army wins");
        }
        LOGGER.info(statistic);
    }
}
