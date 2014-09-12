package pac.pattern.memento;

import org.apache.commons.lang3.StringUtils;

public class Originator {
    private String state = StringUtils.EMPTY;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public Memento createMemento(){
        return new Memento(this.getState());
    }

    public void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }

    public static void main(String[] args) {
        Originator originator = new Originator();
        originator.setState("Burn");

        Caretaker caretaker = new Caretaker();

        caretaker.setMemento(originator.createMemento());
        originator.restoreMemento(caretaker.getMemento());
    }
}
