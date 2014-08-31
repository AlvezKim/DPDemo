package pac.pattern.singleton;

public enum EnumSingleton {
    INSTANCE;

    private final Object object;
    EnumSingleton() {
        object = new Object();
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getObject() {
        return object;
    }
}
