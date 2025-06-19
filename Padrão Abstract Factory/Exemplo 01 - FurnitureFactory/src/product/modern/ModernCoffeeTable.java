package product.modern;

import product.CoffeeTable;

public class ModernCoffeeTable implements CoffeeTable {
    @Override
    public void putItemsOnTop() {
        System.out.println("Colocando itens em uma mesa de centro moderna.");
    }
}