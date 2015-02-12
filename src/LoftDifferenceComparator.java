/**
 * Created by jasonjkeller on 2/11/15.
 */

import java.util.Comparator;

public class LoftDifferenceComparator implements Comparator<Loft> {
    @Override
    public int compare(Loft o1, Loft o2) {
        return Double.compare(o1.getDifference(), o2.getDifference());
    }
}
