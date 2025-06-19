package product.victorian;

import product.CoffeeTable;

public class VictorianCoffeeTable implements CoffeeTable {
    @Override
    public void putItemsOnTop() {
        System.out.println("Colocando itens em uma mesa de centro vitoriana.");
    }
}