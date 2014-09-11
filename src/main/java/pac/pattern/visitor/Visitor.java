package pac.pattern.visitor;

import pac.pattern.visitor.concrete.AlvezElement;
import pac.pattern.visitor.concrete.ConcreteElement;

/**
 * Represent an operation to be performed on the elements of an object structure.
 * Visitor lets you define a new operation without changing the classes of the elements of which it operates.
 */
public interface Visitor {
    void visit(AlvezElement element);
    void visit(ConcreteElement element);
}
