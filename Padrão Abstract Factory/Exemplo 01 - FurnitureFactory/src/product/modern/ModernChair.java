package product.modern;

import product.Chair;

public class ModernChair implements Chair {
    @Override
    public void sitOn() {
        System.out.println("Sentado em uma cadeira moderna.");
    }
}
