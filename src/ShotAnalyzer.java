/**
 * Created by jasonjkeller on 1/31/15.
 */
public class ShotAnalyzer {
    
    // need to move logic from TgcCaddie into here
    // logic variables
    private Pin pin;
    private Lie lie;
    private double totalPinDistance;
    private double lieModifier;
    private double finalResult;

    public ShotAnalyzer(int pinHeight, int pinDistance, int lieMin, int lieMax, int lieActual) {
        // needs Wind still
        
        // set up Pin info
        pin = new Pin();
        pin.setHeight(pinHeight);
        pin.setDistance(pinDistance);

        // set up Lie info
        lie = new Lie();
        lie.setMin(lieMin);
        lie.setMax(lieMax);
//        lie.setActual(lieActual);


    }
    
    public double analyzeShot() {
        totalPinDistance = pin.calcTotalDistance();
        System.out.println("Total Pin Distance: " + String.format("%.2f", totalPinDistance));

        lieModifier = lie.getLieModifier();
        System.out.println("Lie Modifier: " + lieModifier);



        System.out.println("Lie + Pin: " + String.format("%.2f", lieModifier*totalPinDistance/100));

        finalResult = lieModifier*totalPinDistance/100; // not correct, temporary for testing
        // do math related to combining distances for various classes
        
        // needs Wind still
        return finalResult;
    }

    /** test **/
    public static void main(String[] args) {

    }
}
