package pac.pattern.flyweight;

/**
 * Flyweight Pattern
 * use sharing to support large number of fine-grained object efficiently.
 */
public abstract class Flyweight {
    private String intrinsinc;
    protected final String extrinsinc;

    protected Flyweight(String extrinsinc) {
        this.extrinsinc = extrinsinc;
    }

    public abstract void operate();

    public String getIntrinsinc() {
        return intrinsinc;
    }

    public void setIntrinsinc(String intrinsinc) {
        this.intrinsinc = intrinsinc;
    }
}
