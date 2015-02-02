import java.util.Comparator;

/**
 * Created by jasonjkeller on 1/31/15.
 */
public class Loft implements Comparable<Loft>{
    private String club;
    private int loft;
    private double distance;

    public Loft(String c, int l, double d) {
        setClub(c);
        setLoft(l);
        setDistance(d);
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
    
    public int getLoft() {
        return loft;
    }

    public void setLoft(int loft) {
        this.loft = loft;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    @Override
    public String toString() {
        return getClub() + ", Loft: " + getLoft() + ", Distance: " + getDistance();
    }

    @Override
    public int compareTo(Loft loft) {
        if (this.getDistance() > loft.getDistance())
            return 1;
        else if (this.getDistance() < loft.getDistance())
            return -1;
        else
            return 0;
    }

    /** test **/
    public static void main(String[] args) {

    }
}
