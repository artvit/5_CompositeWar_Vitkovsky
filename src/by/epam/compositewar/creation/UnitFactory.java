package by.epam.compositewar.creation;

import by.epam.compositewar.composite.Unit;
import by.epam.compositewar.composite.UnitType;

public class UnitFactory {
    public Unit createUnit(UnitType unitType) {
        switch (unitType) {
            case WARRIOR:
                return new Unit(UnitType.WARRIOR, UnitParameter.WARRIOR_DAMAGE, UnitParameter.WARRIOR_HEALTH);
            case MAGE:
                return new Unit(UnitType.MAGE, UnitParameter.MAGE_DAMAGE, UnitParameter.MAGE_HEALTH);
            case DRAGON:
                return new Unit(UnitType.DRAGON, UnitParameter.DRAGON_DAMAGE, UnitParameter.DRAGON_HEALTH);
            case UNDEAD:
                return new Unit(UnitType.UNDEAD, UnitParameter.UNDEAD_DAMAGE, UnitParameter.UNDEAD_HEALTH);
            case TROLL:
                return new Unit(UnitType.TROLL, UnitParameter.TROLL_DAMAGE, UnitParameter.TROLL_HEALTH);
            default:
                throw new UnsupportedUnitTypeException("Unsupported unit type");
        }
    }
}
