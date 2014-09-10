package pac.pattern.visitor;

import pac.pattern.visitor.concrete.AlvezElement;
import pac.pattern.visitor.concrete.ConcreteElement;
import pac.pattern.visitor.concrete.ConcreteVisitor;

import java.util.Random;

public class ObjectStructure {
    public static Element createElement(){
        if(new Random().nextInt(100)>50)
            return new AlvezElement();
        return new ConcreteElement();
    }

    public static void main(String[] args) {
        Visitor visitor = new ConcreteVisitor();
        for (int i = 0; i < 10; i++) {
            ObjectStructure.createElement().accept(visitor);
        }
    }
}
