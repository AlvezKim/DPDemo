package pac.pattern.factory.abstractfactory;

/**
 * Provide an interface to create families of related or dependent class
 * without specifiying their concrete classes.
 */
public interface Factory {
    public Product createProduct();
}
