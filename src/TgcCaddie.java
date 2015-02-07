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
        // needs Wind still
        
        /* begin user input */
        pinHeight = 5;
        pinDistance = 127;
        lieMin = 89;
        lieMax = 97;
        lieActual = -1;
        // needs Wind still
        /* end user input */

        // logic variables
        ShotAnalyzer shotAnalyzer;
        BagOfClubs bagOfClubs;
        double shotDist;
        String clubToUse;

        shotAnalyzer = new ShotAnalyzer(pinHeight, pinDistance, lieMin, lieMax, lieActual); // needs Wind still
        bagOfClubs = new BagOfClubs();
        shotDist = shotAnalyzer.analyzeShot();
        clubToUse = bagOfClubs.getClub(shotDist);
        System.out.println(clubToUse);
    }
}
