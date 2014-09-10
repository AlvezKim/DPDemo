package pac.pattern.visitor.concrete;

import pac.pattern.visitor.Visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(AlvezElement element) {
        System.out.println("concrete visitor got Alvez");
        element.doSomething();
    }

    @Override
    public void visit(ConcreteElement element) {
        element.doSomething();
    }
}
