/**
 * Created by badams on 3/17/16.
 */
import java.util.Date;

public class WaterHeater extends ServiceCall {
    private int age;
    private String serviceRequested;

    private final double serviceFee = 20;

    WaterHeater( String serviceAddress, String problemDescription, Date date, int age ){
        super(serviceAddress, problemDescription, date);
        this.age = age;

    }
    @Override
    public String toString() {
        String resolvedDateString = ( resolvedDate == null) ? "Unresolved" : this.resolvedDate.toString();
        String resolutionString = ( this.resolution == null) ? "Unresolved" : this.resolution;
        String feeString = (fee == UNRESOLVED) ? "Unresolved" : "$" + Double.toString(fee);
        String serviceFeeString = ( fee == UNRESOLVED ) ? "": "Service Fee = $"+ Double.toString(serviceFee);
        return "Water heater Unit Service Call " + "\n" +
                "Service Address = " + serviceAddress + "\n" +
                "Problem Description = " + problemDescription  + "\n" +
                "Reported Date = " + reportedDate + "\n" +
                "Resolved Date = " + resolvedDateString + "\n" +
                "Resolution = " + resolutionString + "\n" +
                "Fee = " + feeString +"\n" +
                serviceFeeString;

    }
}

