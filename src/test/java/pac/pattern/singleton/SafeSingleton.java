package pac.pattern.singleton;

public class SafeSingleton {
    private  volatile static SafeSingleton singleton;

    private SafeSingleton(){}

    public static SafeSingleton getSingleton(){
        if(singleton == null){
            synchronized (singleton) {
                if(singleton == null){
                    singleton = new SafeSingleton();
                }
            }
        }
        return null;
    }

}
