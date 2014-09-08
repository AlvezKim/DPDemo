package pac.pattern.strategy;

import pac.pattern.strategy.concrete.AlvezStrategy;

public class Context {
    private IStrategy strategy;

    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void executeStrategy(){
        this.strategy.execute();
    }

    public static void main(String[] args) {
        Context context = new Context(new AlvezStrategy());
        context.executeStrategy();
    }
}
