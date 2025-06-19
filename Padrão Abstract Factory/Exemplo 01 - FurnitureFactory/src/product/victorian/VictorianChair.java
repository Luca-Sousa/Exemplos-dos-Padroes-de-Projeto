package product.victorian;

import product.Chair;

public class VictorianChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentado em uma cadeira vitoriana.");
    }
}
