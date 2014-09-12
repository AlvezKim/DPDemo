package pac.pattern.memento;

/**
 * Without violating encapsulation ,capture and externalize an object's internal state
 * so that the object can be restored to this state later.
 */
public class Memento {
    private final String state;

    public Memento(String state) {
        this.state = state;
    }

    public String getState() {
        return state;
    }
}
