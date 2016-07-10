package by.epam.compositewar.creation;

import by.epam.compositewar.composite.Component;
import by.epam.compositewar.composite.Composite;
import by.epam.compositewar.composite.Unit;
import by.epam.compositewar.composite.UnitType;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Random;

public class ArmyCreator {
    private static final Logger LOGGER = LogManager.getLogger();

    private UnitFactory factory = new UnitFactory();

    public Component createFirstArmy() {
        Random random = new Random();
        int size;
        Component army = new Composite();
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            army.add(unit);
            LOGGER.info("Added to army " + unit);
        }
        Component division = new Composite();
        army.add(division);
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            division.add(unit);
            LOGGER.info("Added to division " + unit);
        }
        Component subdivision = new Composite();
        division.add(subdivision);
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            subdivision.add(unit);
            LOGGER.info("Added to subdivision " + unit);
        }
        Component secondDivision = new Composite();
        army.add(secondDivision);
        size = random.nextInt(5) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            secondDivision.add(unit);
            LOGGER.info("Added to the second division " + unit);
        }
        return army;
    }

    public Component createSecondArmy() {
        Random random = new Random();
        int size;
        Component army = new Composite();
        size = random.nextInt(6) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            army.add(unit);
            LOGGER.info("Added to army " + unit);
        }
        Component firstDivision = new Composite();
        size = random.nextInt(6) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            firstDivision.add(unit);
            LOGGER.info("Added to the first division " + unit);
        }
        army.add(firstDivision);
        Component secondDivision = new Composite();
        size = random.nextInt(6) + 1;
        for (int i = 0; i < size; ++i){
            Unit unit = createRandomUnit();
            secondDivision.add(unit);
            LOGGER.info("Added to the second division " + unit);
        }
        army.add(secondDivision);
        return army;
    }

    private Unit createRandomUnit() {
        return factory.createUnit(UnitType.randomUnitType());
    }
}
