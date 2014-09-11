package pac.pattern.visitor;

public interface Element {
    void doSomething();
    void accept(Visitor visitor);
}
