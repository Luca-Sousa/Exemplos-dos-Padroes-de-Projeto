package factory;

import product.Chair;
import product.CoffeeTable;
import product.Sofa;
import product.artdeco.ArtDecoChair;
import product.artdeco.ArtDecoCoffeeTable;
import product.artdeco.ArtDecoSofa;

public class ArtDecoFurnitureFactory implements FurnitureFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }
}