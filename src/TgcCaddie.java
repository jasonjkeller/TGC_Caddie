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
        pinHeight = 13;
        pinDistance = 137;
        lieMin = 99;
        lieMax = 100;
        lieActual = -1;
        windSpeed = 6;
        windDir = Wind.Direction.N;
        /* end user input */

        // logic variables
        ShotAnalyzer shotAnalyzer;
        BagOfClubs bagOfClubs;
        double shotDist;
//        String clubToUse;
        String[] clubsToUse;
//        Loft[] clubsToUse;
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

        clubsToUse = bagOfClubs.getClub(shotDist, lieModifier);
        for (String club : clubsToUse)
            System.out.println(club);
//        clubsToUse = bagOfClubs.getClub(shotDist, lieModifier);
//        System.out.println(clubsToUse[0]);
    }
}
