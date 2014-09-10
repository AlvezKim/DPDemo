package pac.pattern.visitor.concrete;

import pac.pattern.visitor.Element;
import pac.pattern.visitor.Visitor;

public class ConcreteVisitor implements Visitor{
    @Override
    public void visit(Element element) {
        element.doSomething();
    }


}
