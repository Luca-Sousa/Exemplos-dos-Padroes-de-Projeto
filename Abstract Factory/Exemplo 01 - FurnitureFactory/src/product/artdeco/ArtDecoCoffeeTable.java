package product.artdeco;

import product.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void putItemsOnTop() {
        System.out.println("Colocando itens em uma mesa de centro Art Déco.");
    }
}