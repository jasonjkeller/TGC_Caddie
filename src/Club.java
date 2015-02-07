/**
 * Created by jasonjkeller on 1/16/15.
 */


import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class Club {
    // might want to narrow the down to loft/deloft +-2, 3&4 probably not used much, would simplify setting up Club objects
    private static final int BASE0 =  0;
    private static final int LOFT1 =  1;
    private static final int LOFT2 =  2;
    private static final int LOFT3 =  3;
    private static final int LOFT4 =  4;
    private static final int DELOFT1 = -1;
    private static final int DELOFT2 = -2;
    private static final int DELOFT3 = -3;
    private static final int DELOFT4 = -4;
    private static final int NUM_OF_LOFTS = 9;

    private List<Loft> lofts;

    public Club(String name, double base, double l1, double l2, double l3, 
                double l4, double d1, double d2, double d3, double d4) {
        Loft baseLoft = new Loft(name, BASE0, base);
        Loft loft1 = new Loft(name, LOFT1, l1);
        Loft loft2 = new Loft(name, LOFT2, l2);
        Loft loft3 = new Loft(name, LOFT3, l3);
        Loft loft4 = new Loft(name, LOFT4, l4);
        Loft deloft1 = new Loft(name, DELOFT1, d1);
        Loft deloft2 = new Loft(name, DELOFT2, d2);
        Loft deloft3 = new Loft(name, DELOFT3, d3);
        Loft deloft4 = new Loft(name, DELOFT4, d4);
        
        lofts = new ArrayList<Loft>(NUM_OF_LOFTS);
        lofts.add(baseLoft);
        lofts.add(loft1);
        lofts.add(loft2);
        lofts.add(loft3);
        lofts.add(loft4);
        lofts.add(deloft1);
        lofts.add(deloft2);
        lofts.add(deloft3);
        lofts.add(deloft4);
    }

    // get ArrayList of Loft objects
    public List<Loft> getLofts() {
        return lofts;
    }

    /** class test **/
    public static void main(String[] args) {
        Club club = new Club("9 iron", 132, 114, 96.4, 79.2, 63.4, 165, 186, 176, 83.2);
        List<Loft> loftList = club.getLofts();
//        Collections.sort(loftList);
        for (Loft l: loftList) {
            System.out.println(l);
        }
    }
}