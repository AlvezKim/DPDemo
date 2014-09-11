package pac.pattern.prototype;


public class Prototype implements Cloneable{

    private Element element;
    private String weekDay;


    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public Prototype(Element element) {
        this.element = element;
    }

    public String getWeekDay() {
        return weekDay;
    }

    public void setWeekDay(String weekDay) {
        this.weekDay = weekDay;
    }

    public void consume(){
        System.out.println("consumed on ".concat(this.weekDay));
    }
}
