
/**
 * Write a description of class Thermometer here.
 *
 * @author (S.Gullik.E)
 * @version (1.6v)
 */
public class Thermometer extends Meter
{
    private double minTemprature;
    private double maxTemprature;
    
    public Thermometer()
    {
        super();
        this.setMinTemprature(0.00);
        this.setMaxTemprature(100.00);
    }

    public Thermometer(String id, String locationCode, boolean usable, double minTemprature, double maxTemprature)
    {
        super(id,locationCode, usable);
        this.setMinTemprature(minTemprature);
        this.setMaxTemprature(maxTemprature);
     }
     
    public double getMinTemprature()
    {
        return this.minTemprature;
    }
    
    public void setMinTemprature(double minTemprature)
    {
        this.minTemprature = minTemprature;
    }
    
    public double getMaxTemprature()
    {
        return this.maxTemprature;
    }
    
    public void setMaxTemprature(double maxTemprature)
    {
        this.maxTemprature = maxTemprature;
    }

}
