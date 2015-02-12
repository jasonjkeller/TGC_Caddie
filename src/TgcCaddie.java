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
        int windSpeed;
        Wind.Direction windDir;

        /* begin user input */
        pinHeight = 3;
        pinDistance = 158;
        lieMin = 84;
        lieMax = 94;
        lieActual = -1;
        windSpeed = 6;
        windDir = Wind.Direction.N;
        /* end user input */

        // logic variables
        ShotAnalyzer shotAnalyzer;
        BagOfClubs bagOfClubs;
        double shotDist;
        String clubToUse;
        Lie lie;
        double lieModifier;

        shotAnalyzer = new ShotAnalyzer(pinHeight, pinDistance, windSpeed, windDir);
        bagOfClubs = new BagOfClubs();
        shotDist = shotAnalyzer.analyzeShot();

        // set up Lie info
        lie = new Lie();
        lie.setMin(lieMin);
        lie.setMax(lieMax);
        lie.setActual(lieActual);
        lieModifier = lie.getLieModifier();
        System.out.println("Lie Modifier: " + lieModifier);

        clubToUse = bagOfClubs.getClub(shotDist);
        System.out.println(clubToUse);
    }
}
