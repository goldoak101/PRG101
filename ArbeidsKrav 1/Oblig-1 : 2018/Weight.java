
/**
 * Write a description of class Weight here.
 *
 * @author (S.Gullik.E)
 * @version (1.6v)
 */
public class Weight extends Meter
{
    private double minWeight;
    private double maxWeight;
    
    public Weight()
    {
        super();
        setMinWeight(00.00);
        setMaxWeight(100.00);
    }

    public Weight(String idNumber, String locationCode, boolean usable, double minWeight, double maxWeight) {
        super(idNumber,locationCode,usable);
        setMinWeight(minWeight);
        setMaxWeight(maxWeight);
    }
    
    public double getMinWeight() {
        return this.minWeight;
    }

    public void setMinWeight(double minWeight) {
        this.minWeight = minWeight;
    }

    public double getMaxWeight() {
        return this.maxWeight;
    }

    public void setMaxWeight(double maxWeight) {
        this.maxWeight = maxWeight;
    }
    
}
