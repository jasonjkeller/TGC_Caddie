/**
 * Created by jasonjkeller on 1/31/15.
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class BagOfClubs {
    private List<Loft> loftList;
    private static final int NUM_OF_LOFTS = 9;
    private static final int NUM_OF_CLUBS = 13;
    
    public BagOfClubs() {
        loftList = new ArrayList<Loft>(NUM_OF_CLUBS * NUM_OF_LOFTS);
        // contains an ArrayList of club objects: w1, w3, w5, i3, i4, i5, i6, i7, i8, i9, pw, sw, lw
        // create clubs
        Club i9 = new Club("9 iron", 132, 114, 96.4, 79.2, 63.4, 165, 186, 176, 83.2);
        Club w1 = new Club("Driver", 232, 214, 196.4, 179.2, 163.4, 265, 286, 276, 183.2);
        
        // add Loft objects from each club to arrayList
        loftList.addAll(i9.getLofts());
        loftList.addAll(w1.getLofts());
    }
    
    // iterate through each clubs loftList adding it's Loft objects to a sorted data structure (key is Loft distance)

    // alternatives
    // matrix for searching NOPE
    // hashmap to retrieve club info from NOPE
    
    // Collections.sort(loftList);

    public String getClub(double yardage) {
        // sort loftList
        Collections.sort(loftList);
        // iterate through loftList as long as distance is decreasing to find closest match
        // as soon as the difference between club distances starts to increase abort search
        double diff = 100000;
        double currentDiff = 100000;
        Loft bestLoft = null;
        for (Loft loft : loftList) {
            currentDiff = Math.abs(yardage - loft.getDistance());
            if (currentDiff < diff) {
                diff = currentDiff;
                bestLoft = loft;
            } else {
                break;
            }
        }
        // some string to be displayed to user
        return "CHOSEN CLUB FOR " + yardage + " YARDS: " + bestLoft.toString() + " Within: " + currentDiff;
    }

    public List<Loft> getLoftList() {
        return loftList;
    }

    /** test **/
    public static void main(String[] args) {
        BagOfClubs bag = new BagOfClubs();
        List<Loft> list = bag.getLoftList();
        for (Loft l: list) {
            System.out.println(l);
        }
        String chosenShot = bag.getClub(128);
        System.out.println(chosenShot);
    }
}
