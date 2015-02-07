/**
 * Created by jasonjkeller on 1/31/15.
 */
public class ShotAnalyzer {
    
    // need to move logic from TgcCaddie into here
    // logic variables
    private Pin pin;
    private Lie lie;
    private Wind wind;
//    private double totalPinDistance;
//    private double lieModifier;
//    private double windModifier;
//    private double finalResult;

    public ShotAnalyzer(int pinHeight, int pinDistance, int lieMin, int lieMax, int lieActual, int windSpeed, Wind.Direction windDir) {
        // needs Wind still
        
        // set up Pin info
        pin = new Pin();
        pin.setHeight(pinHeight);
        pin.setDistance(pinDistance);

        // set up Lie info
        lie = new Lie();
        lie.setMin(lieMin);
        lie.setMax(lieMax);
        lie.setActual(lieActual);
        
        // set up Wind info
        wind = new Wind();
        wind.setSpeed(windSpeed);
        wind.setDirection(windDir);
    }
    
    public double analyzeShot() {
        double totalPinDistance;
        double lieModifier;
        double windModifier;
        double finalResult;

        totalPinDistance = pin.calcTotalDistance();
        System.out.println("Total Pin Distance: " + String.format("%.2f", totalPinDistance));

        lieModifier = lie.getLieModifier();
        System.out.println("Lie Modifier: " + lieModifier);
        
        System.out.println("Lie + Pin: " + String.format("%.2f", lieModifier*totalPinDistance/100));

        windModifier = wind.getWindModifier();
        System.out.println("Wind Modifier " + String.format("%.2f", windModifier));

        finalResult = windModifier + (lieModifier*totalPinDistance/100); // not correct, temporary for testing
        System.out.println("Final Result " + String.format("%.2f", finalResult));

        return finalResult;
    }

    /** test **/
    public static void main(String[] args) {

    }
}
