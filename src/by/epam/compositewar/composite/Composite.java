package by.epam.compositewar.composite;

import java.util.ArrayList;
import java.util.Random;

public class Composite implements Component {

    private ArrayList<Component> components;

    public Composite() {
        components = new ArrayList<>();
    }

    @Override
    public boolean add(Component component) {
        components.add(component);
        return true;
    }


    @Override
    public boolean remove(Component unit) {
        boolean result = false;
        if (!components.remove(unit)) {
            Component removingComponent = null;
            for (Component component : components) {
                if (component.remove(unit)) {
                    if (component.size() == 0) {
                        removingComponent = component;
                    }
                    result = true;
                }
            }
            components.remove(removingComponent);
            return result;
        } else {
            return true;
        }
    }

    @Override
    public int size() {
        return components.stream().mapToInt(Component::size).sum();
    }

    @Override
    public void assault(Component army) {
        for (Component component: components) {
            component.assault(army);
            if (army.size() == 0) {
                break;
            }
        }
    }

    @Override
    public Unit getRandomUnit() {
        return components.get(new Random().nextInt(components.size())).getRandomUnit();
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (Component component : components) {
            stringBuilder.append(component).append("\n");
        }
        return "Composite{division=\n" + stringBuilder +
                "}";
    }
}
