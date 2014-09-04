package pac.pattern.factory.factorymethod;

/**
 * Define an interface for creating an Object,but let the subclass decide which class to instantiate.
 * Factory Method lets a class defer instantiation to subclass.
 */
public interface Factory {
    public Product createProduct();
}
