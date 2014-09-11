package pac.pattern.visitor.concrete;

import pac.pattern.visitor.Visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(ConcreteElement element) {
        element.doSomething();
    }

    @Override
    public void visit(AlvezElement element) {
        element.show();
    }
}
