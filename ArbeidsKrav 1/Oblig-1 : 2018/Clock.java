
/**
 * Write a description of class Clock here.
 *
 * @author (S.Gullik.E)
 * @version (1.6v)
 */
public class Clock extends Meter
{
    private double sec;

    public Clock() {
        super();
        setSec(1.0);
    }

    public Clock(String regNr, String location, boolean usable, double sec) {
        super(regNr, location, usable);
        setSec(sec);
    }

    public double getSec() {
        return sec;
    }

    public void setSec(double sec) {
        this.sec = sec;
    }
    
     public String toString() {
        return getClass()+ "\n" + super.toString() + "Clock interval measurement: "  +
                getSec() + "\n" + "\n";
    }
}

