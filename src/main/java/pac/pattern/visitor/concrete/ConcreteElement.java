package pac.pattern.visitor.concrete;


import pac.pattern.visitor.Element;
import pac.pattern.visitor.Visitor;

public class ConcreteElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("concrete element do something...");
    }
}
