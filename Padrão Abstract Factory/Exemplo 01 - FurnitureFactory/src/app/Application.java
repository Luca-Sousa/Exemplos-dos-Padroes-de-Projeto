package app;

import factory.FurnitureFactory;
import product.Chair;
import product.CoffeeTable;
import product.Sofa;

public class Application {
    private final Chair chair;
    private final Sofa sofa;
    private final CoffeeTable coffeeTable;

    public Application(FurnitureFactory factory) {
        chair = factory.createChair();
        sofa = factory.createSofa();
        coffeeTable = factory.createCoffeeTable();
    }

    public void useFurniture() {
        chair.sitOn();
        sofa.lieDown();
        coffeeTable.putItemsOnTop();
    }
}
