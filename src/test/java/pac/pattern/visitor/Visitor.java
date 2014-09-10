package pac.pattern.visitor;

import pac.pattern.visitor.concrete.AlvezElement;
import pac.pattern.visitor.concrete.ConcreteElement;

public interface Visitor {
    void visit(ConcreteElement element);
    void visit(AlvezElement element);
}
