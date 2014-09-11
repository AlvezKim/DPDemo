package pac.pattern.factory.factorymethod.concrete.factory;

import pac.pattern.factory.factorymethod.Factory;
import pac.pattern.factory.factorymethod.Product;
import pac.pattern.factory.factorymethod.concrete.product.Product1;

public class ConcreateFactory1 implements Factory {

    @Override
    public Product createProduct() {
        return new Product1();
    }
}
