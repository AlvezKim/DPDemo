package pac.pattern.singleton;

public class EagerlySingleton {
    private static EagerlySingleton singleton = new EagerlySingleton();

    private EagerlySingleton(){}

    public static EagerlySingleton getSingleton(){
        return singleton;
    }
}
