package app;

import factory.ModernFurnitureFactory;
import factory.VictorianFurnitureFactory;
import factory.FurnitureFactory;

public class Main {
    public static void main(String[] args) {
        FurnitureFactory factory = new ModernFurnitureFactory();
        Application app = new Application(factory);
        app.useFurniture();

        System.out.println("\n--- Trocando para móveis vitorianos ---\n");

        factory = new VictorianFurnitureFactory();
        app = new Application(factory);
        app.useFurniture();
    }
}
