package pac.pattern.prototype;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        Element element = new Element.ElementBuilder().setTitle("title1").setComment("just test").setLife(10).build();
        Prototype prototype = new Prototype(element);
        prototype.setWeekDay("Sunday");
        prototype.consume();

        Prototype prototype1 = (Prototype) prototype.clone();
        prototype1.setWeekDay("Monday");
        prototype1.consume();
    }
}
