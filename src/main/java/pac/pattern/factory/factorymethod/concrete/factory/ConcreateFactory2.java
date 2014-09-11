package pac.pattern.factory.factorymethod.concrete.factory;

import pac.pattern.factory.factorymethod.Factory;
import pac.pattern.factory.factorymethod.Product;
import pac.pattern.factory.factorymethod.concrete.product.Product2;

public class ConcreateFactory2 implements Factory {

    @Override
    public Product createProduct() {
        return new Product2();
    }
}
