package product.artdeco;

import product.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentando em uma cadeira Art Déco..");
    }
}