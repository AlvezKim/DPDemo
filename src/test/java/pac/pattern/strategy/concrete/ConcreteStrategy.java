package pac.pattern.strategy.concrete;

import pac.pattern.strategy.IStrategy;

public class ConcreteStrategy implements IStrategy{
    @Override
    public void execute() {
        System.out.println("Just a concrete strategy...");
    }
}
