package pac.pattern.flyweight;

public class SharedFlyweight extends  Flyweight{

    protected SharedFlyweight(String extrinsinc) {
        super(extrinsinc);
    }

    @Override
    public void operate() {
        System.out.println("operating...");
    }
}
