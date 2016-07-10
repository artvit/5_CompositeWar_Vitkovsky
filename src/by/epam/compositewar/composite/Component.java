package by.epam.compositewar.composite;

public interface Component{
    boolean add(Component component);
    boolean remove(Component component);
    int size();
    void assault(Component army);
    Unit getRandomUnit();
}
