package pac.pattern.strategy.concrete;

import pac.pattern.strategy.IStrategy;

public class AlvezStrategy implements IStrategy{
    @Override
    public void execute() {
        System.out.println("Here is the strategy setted by Alvez.");
    }
}
