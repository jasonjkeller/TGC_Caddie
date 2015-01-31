/**
 * Created by jasonjkeller on 1/16/15.
 */
public class TgcCaddie {
    public static void main(String[] args) {
        // user supplied info
        int pinHeight;
        int pinDistance;
        int lieMin;
        int lieMax;
        int lieActual;
        
        // logic variables
        Pin pin;
        Lie lie;
        double totalPinDistance;
        double lieModifier;
        
        /* begin user input */
        pinHeight = -17;
        pinDistance = 121;
        lieMin = 81;
        lieMax = 100;
        lieActual = -1;
        /* end user input */

        // set up Pin info
        pin = new Pin();
        pin.setHeight(pinHeight);
        pin.setDistance(pinDistance);
        totalPinDistance = pin.calcTotalDistance();
        System.out.println("Total Pin Distance: " + String.format("%.2f", totalPinDistance));

        // set up Lie info
        lie = new Lie();
        lie.setMin(lieMin);
        lie.setMax(lieMax);
//        lie.setActual(lieActual);
        lieModifier = lie.getLieModifier();
        System.out.println("Lie Modifier: " + lieModifier);
        
        
        
        System.out.println("Lie + Pin: " + String.format("%.2f", lieModifier*totalPinDistance/100));

    }
}
