package pac.pattern.visitor.concrete;

import pac.pattern.visitor.Element;
import pac.pattern.visitor.Visitor;

public class AlvezElement implements Element {
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }

    @Override
    public void doSomething() {
        System.out.println("Alvez do something fabulous!");
    }

    public void show() {
        System.out.println("Alvez show someting fabulous!");
    }
}
