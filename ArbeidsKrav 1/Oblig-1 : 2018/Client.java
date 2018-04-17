
/**
 *
 * @author (S.Gullik.E)
 * @version (1.0v)
 */
public class Client
{
    private MeterArchive arc;
    /**
     * Constructor for objects of class Client
     */
    public void mainMethod(){
        arc = new MeterArchive();
        
        //Weight
        arc.addInstrument(new Weight("R2000","R501T1",true,0.01,10.0));
        arc.addInstrument(new Weight("R2001","R501T2",true,0.1,100.0));
        arc.addInstrument(new Weight("R2002","R501T3",true,1.0,1000.0));
        
        //Thermometer
        arc.addInstrument(new Thermometer("T1000","R501T4",true,00.01,100.0));
        arc.addInstrument(new Thermometer("T1001","R501T5",true,1.0,200.0));
        
        //Clock
        arc.addInstrument(new Clock("K9000","R501T6",true,4));
        arc.addInstrument(new Clock("K9001","R501T7",true,0.01));
        arc.addInstrument(new Clock("K9002","R2501T8",true,1.0));
        
        System.out.println("Print all Instruments in stock:");
        System.out.println();
        arc.printInstruments();
        System.out.println();
        
        System.out.println("Removing instrument with idNumber: T2007 \n");
        arc.removeInstrument("T2007");
        System.out.println();
        
        System.out.println("Change location on idNumber: T2001 to location: Garage");
        arc.changeInstrumentLocation("T2001","Garage");
        System.out.println();
        
        System.out.println("Print updated stock of instruments:");
        System.out.println();
        arc.printInstruments();
        System.out.println();
       
        
        
    }

    
}
