import java.util.Objects;

/**
 * Write a description of class Meter here.
 *
 * @author (S.Gullik.E)
 * @version (1.6v)
 */
public abstract class Meter
{
    
    private String idNumber;
    private boolean usable;
    private String locationCode;
    
    /**
     * Constructor for objects of class Meter
     */
    public Meter()
    {
        idNumber = "Unkown";
        usable = false;
        locationCode = "Unkown";
    }

    public Meter (String idNumber, String locationCode, boolean usable)
    {
        this.idNumber = idNumber;
        this.locationCode = locationCode;
        this.usable = usable;
    }
    
    public String getIdNumber()
    {
        return this.idNumber;
    }
    
    public void setIdNumber(String idNumber) {
        this.idNumber = idNumber;
    }
    
    public boolean isUsable() {
        return usable;
    }
    
    public void setUsable(boolean usable) {
        this.usable = usable;
    }
    
    public String getLocationCode() {
        return locationCode;
    }

    public void setLocationCode(String locationCode) {
        this.locationCode = locationCode;
    }
    
    @Override
    public String toString() {
        return 
        "RegistrationNumber: " + idNumber + "\n" +
        "Usable: " + usable + "\n" +
        "Location: " + locationCode + "\n";

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) 
            return true;
        if (!(o instanceof Meter)) 
            return false;
        Meter meter = (Meter) o;
        return isUsable() == meter.isUsable() &&
        Objects.equals(getIdNumber(), meter.getIdNumber()) &&
        Objects.equals(getLocationCode(), meter.getLocationCode());
    }
}
