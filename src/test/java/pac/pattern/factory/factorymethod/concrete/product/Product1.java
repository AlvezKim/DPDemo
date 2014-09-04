package pac.pattern.factory.factorymethod.concrete.product;

import pac.pattern.factory.factorymethod.Product;

public class Product1 implements Product{
    @Override
    public void method_1() {
        System.out.println("method_1 of Product1");
    }

    @Override
    public void method_0() {
        System.out.println("method_0 of Product1");
    }
}
