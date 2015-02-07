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
    private static final double NO_VALUE = 9999;

    public BagOfClubs() {
        loftList = new ArrayList<Loft>(NUM_OF_CLUBS * NUM_OF_LOFTS);
        
//        // create club objects: w1, w3, w5, i3, i4, i5, i6, i7, i8, i9, pw, sw, lw
//        // normal
//        Club w1 = new Club("Driver", 265, 268, 268, 270, 270, 254, 236, 204, 156);
//        Club w3 = new Club("3 Wood", 245, 247, 247, 247, 247, 235, 216, 181, 127);
//        Club w5 = new Club("5 Wood", 225, 225, 225, 225, 225, 218, 200, 164, 104);
//        Club i3 = new Club("3 iron", 207, 199, 186, 168, 147, 205, 190, 153, 89);
//        Club i4 = new Club("4 iron", 195, 185, 170, 150, 133, 197, 185, 150, 80);
//        Club i5 = new Club("5 iron", 181, 168, 152, 134, 116, 186, 179, 147, 72.4);
//        Club i6 = new Club("6 iron", 170, 155, 138, 119, 102, 184, 182, 153, 71.4);
//        Club i7 = new Club("7 iron", 158, 141, 123, 104, 86.9, 179, 185, 160, 71.1);
//        Club i8 = new Club("8 iron - Normal", 145, 126, 109, 91.4, 75.4, 173, 187, 170, 78.3);
//        Club i9 = new Club("9 iron - Normal", 132, 114, 96.4, 79.2, 63.4, 165, 186, 176, 83.2);
//        Club pw = new Club("Pitching Wedge - Normal", 120, 102, 85.2, 69.6, 55.2, 157, 185, 179, 76.8);
//        Club sw = new Club("Sand Wedge - Normal", 95, 81.7, 69.4, 58, 46.6, 138, 178, 187, 89.3);
//        Club lw = new Club("Lob Wedge - Normal", 75, 65.3, 56.3, 47.3, 46.5, 121, 167, 185, 80.3);
//        // pitch
//        Club i8P = new Club("8 iron - Pitch", 90, 80.1, 68.4, 57.6, 45.9, 102, 101, 79.2, 33.3);
//        Club i9P = new Club("9 iron - Pitch", 80, 69.6, 58.4, 47.2, 36.8, 95.2, 99.2, 80.8, 32.8);
//        Club pwP = new Club("Pitching Wedge - Pitch", 75, 63.8, 52.5, 41.3, 31.5, 95.3, 103, 85.5, 32.3);
//        Club swP = new Club("Sand Wedge - Pitch", 55, 46.8, 38.5, 30.8, 24.2, 79.8, 95.2, 85.3, 33);
//        Club lwP = new Club("Lob Wedge - Pitch", 45, 38.3, 32, 26.1, 20.7, 74.3, 97.2, 92.3, 32.4);
//        // flop
//        Club pwF = new Club("Pitching Wedge - Flop", 40, 30.4, NO_VALUE, NO_VALUE, NO_VALUE, 50.8, 61.6, 72.4, 91.6);
//        Club swF = new Club("Sand Wedge - Flop", 35, 31.5, 24.5, NO_VALUE, NO_VALUE, 39.2, 47.3, 55.7, 80.9);
//        Club lwF = new Club("Lob Wedge - Flop", 30, 25.2, 20.1, NO_VALUE, NO_VALUE, 30.9, 37.2, 43.8, 72.3);

        // create club objects: w1, w3, w5, i3, i4, i5, i6, i7, i8, i9, pw, sw, lw
        // normal
        Club w1 = new Club("Driver", 265, 268, 268, NO_VALUE, NO_VALUE, 254, 236, NO_VALUE, NO_VALUE);
        Club w3 = new Club("3 Wood", 245, 247, 247, NO_VALUE, NO_VALUE, 235, 216, NO_VALUE, NO_VALUE);
        Club w5 = new Club("5 Wood", 225, 225, 225, NO_VALUE, NO_VALUE, 218, 200, NO_VALUE, NO_VALUE);
        Club i3 = new Club("3 iron", 207, 199, 186, NO_VALUE, NO_VALUE, 205, 190, NO_VALUE, NO_VALUE);
        Club i4 = new Club("4 iron", 195, 185, 170, NO_VALUE, NO_VALUE, 197, 185, NO_VALUE, NO_VALUE);
        Club i5 = new Club("5 iron", 181, 168, 152, NO_VALUE, NO_VALUE, 186, 179, NO_VALUE, NO_VALUE);
        Club i6 = new Club("6 iron", 170, 155, 138, NO_VALUE, NO_VALUE, 184, 182, NO_VALUE, NO_VALUE);
        Club i7 = new Club("7 iron", 158, 141, 123, NO_VALUE, NO_VALUE, 179, 185, NO_VALUE, NO_VALUE);
        Club i8 = new Club("8 iron - Normal", 145, 126, 109, NO_VALUE, NO_VALUE, 173, 187, NO_VALUE, NO_VALUE);
        Club i9 = new Club("9 iron - Normal", 132, 114, 96.4, NO_VALUE, NO_VALUE, 165, 186, NO_VALUE, NO_VALUE);
        Club pw = new Club("Pitching Wedge - Normal", 120, 102, 85.2, NO_VALUE, NO_VALUE, 157, 185, NO_VALUE, NO_VALUE);
        Club sw = new Club("Sand Wedge - Normal", 95, 81.7, 69.4, NO_VALUE, NO_VALUE, 138, 178, NO_VALUE, NO_VALUE);
        Club lw = new Club("Lob Wedge - Normal", 75, 65.3, 56.3, NO_VALUE, NO_VALUE, 121, 167, NO_VALUE, NO_VALUE);
        // pitch
        Club i8P = new Club("8 iron - Pitch", 90, 80.1, 68.4, NO_VALUE, NO_VALUE, 102, 101, NO_VALUE, NO_VALUE);
        Club i9P = new Club("9 iron - Pitch", 80, 69.6, 58.4, NO_VALUE, NO_VALUE, 95.2, 99.2, NO_VALUE, NO_VALUE);
        Club pwP = new Club("Pitching Wedge - Pitch", 75, 63.8, 52.5, NO_VALUE, NO_VALUE, 95.3, 103, NO_VALUE, NO_VALUE);
        Club swP = new Club("Sand Wedge - Pitch", 55, 46.8, 38.5, NO_VALUE, NO_VALUE, 79.8, 95.2, NO_VALUE, NO_VALUE);
        Club lwP = new Club("Lob Wedge - Pitch", 45, 38.3, 32, NO_VALUE, NO_VALUE, 74.3, 97.2, NO_VALUE, NO_VALUE);
        // flop
        Club pwF = new Club("Pitching Wedge - Flop", 40, 30.4, NO_VALUE, NO_VALUE, NO_VALUE, 50.8, 61.6, NO_VALUE, NO_VALUE);
        Club swF = new Club("Sand Wedge - Flop", 35, 31.5, 24.5, NO_VALUE, NO_VALUE, 39.2, 47.3, NO_VALUE, NO_VALUE);
        Club lwF = new Club("Lob Wedge - Flop", 30, 25.2, 20.1, NO_VALUE, NO_VALUE, 30.9, 37.2, NO_VALUE, NO_VALUE);

        // add Loft objects from each club to arrayList
        // normal
        loftList.addAll(w1.getLofts());
        loftList.addAll(w3.getLofts());
        loftList.addAll(w5.getLofts());
        loftList.addAll(i3.getLofts());
        loftList.addAll(i4.getLofts());
        loftList.addAll(i5.getLofts());
        loftList.addAll(i6.getLofts());
        loftList.addAll(i7.getLofts());
        loftList.addAll(i8.getLofts());
        loftList.addAll(i9.getLofts());
        loftList.addAll(pw.getLofts());
        loftList.addAll(sw.getLofts());
        loftList.addAll(lw.getLofts());
        // pitch
        loftList.addAll(i8P.getLofts());
        loftList.addAll(i9P.getLofts());
        loftList.addAll(pwP.getLofts());
        loftList.addAll(swP.getLofts());
        loftList.addAll(lwP.getLofts());
        // flop
        loftList.addAll(pwF.getLofts());
        loftList.addAll(swF.getLofts());
        loftList.addAll(lwF.getLofts());

        // sort loftList
        Collections.sort(loftList);
    }
    
    // iterate through each clubs loftList adding it's Loft objects to a sorted data structure (key is Loft distance)

    // alternatives
    // matrix for searching NOPE
    // hashmap to retrieve club info from NOPE
    
    // Collections.sort(loftList);

    public String getClub(double yardage) {
//        // sort loftList
//        Collections.sort(loftList);
        // iterate through loftList as long as distance is decreasing to find closest match
        // as soon as the difference between club distances starts to increase abort search
        double diff = 100000;
        double currentDiff;
        Loft bestLoft = null;
        for (Loft loft : loftList) {
            currentDiff = Math.abs(yardage - loft.getDistance());
            if (currentDiff < diff) {
                diff = currentDiff;
                bestLoft = loft;
            } else if (currentDiff == diff) {
                // do nothing
            } else {
                break;
            }
        }
        // some string to be displayed to user
        return "CHOSEN CLUB FOR " + yardage + " YARDS: " + bestLoft.toString() + " Within: " + diff;
    }

    public List<Loft> getLoftList() {
        return loftList;
    }

    /** test **/
    public static void main(String[] args) {
        BagOfClubs bag = new BagOfClubs();
        List<Loft> list = bag.getLoftList();
        Collections.sort(list);
        for (Loft l: list) {
            System.out.println(l);
        }
        String chosenShot = bag.getClub(246);
        System.out.println(chosenShot);
    }
}
