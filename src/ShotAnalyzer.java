/**
 * Created by jasonjkeller on 1/31/15.
 */


public class ShotAnalyzer {
    // logic variables
    private Pin pin;
    private Wind wind;

    public ShotAnalyzer(int pinHeight, int pinDistance, int windSpeed, Wind.Direction windDir) {
        // set up Pin info
        pin = new Pin();
        pin.setHeight(pinHeight);
        pin.setDistance(pinDistance);
        
        // set up Wind info
        wind = new Wind();
        wind.setSpeed(windSpeed);
        wind.setDirection(windDir);
    }
    
    public double analyzeShot() {
        double totalPinDistance;
        double windModifier;
        double finalResult;

        totalPinDistance = pin.calcTotalDistance();
        System.out.println("Pin Distance + Height: " + String.format("%.2f", totalPinDistance));

        windModifier = wind.getWindModifier();
        System.out.println("Wind Modifier: " + String.format("%.2f", windModifier));

        finalResult = windModifier + totalPinDistance;
        System.out.println("Pin Distance + Height + Wind: " + String.format("%.2f", finalResult));

        return finalResult;
    }

    /** class test **/
    public static void main(String[] args) {
        int pHeight = 6;
        int pDist = 178;
        int wSpeed = 5;
        Wind.Direction wDir = Wind.Direction.N;
        
        ShotAnalyzer shotAnalyzer = new ShotAnalyzer(pHeight, pDist, wSpeed, wDir);
        System.out.println(shotAnalyzer.analyzeShot());
    }
}
