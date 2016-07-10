package by.epam.compositewar.composite;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Objects;

public class Unit implements Component{
    public static final Logger LOGGER = LogManager.getLogger();

    private int damage;
    private int maxHealth;
    private int currentHealth;
    private UnitType type;

    public Unit(UnitType type, int damage, int health) {
        this.type = type;
        this.damage = damage;
        this.maxHealth = health;
        this.currentHealth = health;
    }

    @Override
    public boolean add(Component component)  {
        return false;
    }

    @Override
    public boolean remove(Component component) {
        return false;
    }

    @Override
    public int size() {
        return 1;
    }

    @Override
    public void assault(Component army) {
        Unit enemy = army.getRandomUnit();
        LOGGER.info(this + " attacked " + enemy + " for " + damage + " hp");
        attack(enemy);
        if (!enemy.isAlive()) {
            LOGGER.info(enemy + " has died");
            army.remove(enemy);
        }
    }

    @Override
    public Unit getRandomUnit() {
        return this;
    }

    public void attack(Unit enemy) {
        enemy.currentHealth -= this.damage;
    }

    public boolean isAlive() {
        return currentHealth > 0;
    }

    @Override
    public String toString() {
        return "Unit{" + type +
                ", dmg=" + damage +
                ", hp=" + currentHealth +
                "/" + maxHealth +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Unit)) {
            return false;
        }
        Unit unit = (Unit) o;
        return damage == unit.damage &&
                maxHealth == unit.maxHealth &&
                currentHealth == unit.currentHealth &&
                type == unit.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(damage, maxHealth, type);
    }
}
