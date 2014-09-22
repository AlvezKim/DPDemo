package pac.pattern.flyweight;

import java.util.HashMap;

public class FlyweightFactory {
    private static HashMap<String, Flyweight> pool = new HashMap<>();

    public static Flyweight getFlyweight(String extrinsinc) {
        Flyweight flyweight = null;
        if (pool.containsKey(extrinsinc)) {
            flyweight = pool.get(extrinsinc);
        } else {
            flyweight = new SharedFlyweight(extrinsinc);
            pool.put(extrinsinc, new SharedFlyweight(extrinsinc));
        }
        return flyweight;
    }

}
