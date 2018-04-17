import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;
/**
 * Write a description of class MeterArchive here.
 *
 * @author (S.Gullik.E)
 * @version (1.6v)
 */
public class MeterArchive
{
    private List<Meter> meters;

    public MeterArchive() 
    {
        meters = new ArrayList<>();
    }

    public void addInstrument(Meter obj){
        meters.add(obj);
    }

    protected void removeInstrument(Meter obj){
        meters.remove(obj);
    }

    public Meter getInstrument(String idNumber){
        for(Meter m: meters){
            if(idNumber.equals(m.getIdNumber())){
                return m;
            }
        }
        System.out.println("-Unknown idNumber");
        return null;
    }

    public boolean removeInstrument(String idNumber) {
        removeInstrument(getInstrument(idNumber));
        return true;
    }

    public boolean changeInstrumentLocation(String idNumber, String newLocationCode){      
        Meter o;                                                                    
        o = getInstrument(idNumber);                                                   
        o.setLocationCode(newLocationCode);                                                 

        System.out.println("-Changed! \n");
        return true;                                                                
    }      

    public boolean changeInstrumentUsable(String idNumber, boolean newUsable){      
        Meter o;                                                                    
        o = getInstrument(idNumber);                                                   
        o.setUsable(newUsable);                                                 

        return true;                                                                
    }      

    public void printInstruments(){
        for(Meter m: meters){
            System.out.println(m.toString());
        }
    }
}
