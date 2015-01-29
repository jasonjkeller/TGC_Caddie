/**
 * Created by jasonjkeller on 1/16/15.
 */

// rough type, percentages
public class Lie {
    private String type;
    private double lo;
    private double hi;
    private double mid;

    public double getMid() {
        return mid;
    }

    public void setMid() {
        this.mid = getLo() + (getHi() - getLo()) / 2;
    }

    public double getHi() {
        return hi;
    }

    public void setHi(double hi) {
        this.hi = hi;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getLo() {
        return lo;
    }

    public void setLo(double lo) {
        this.lo = lo;
    }
    
    /** test **/
    public static void main(String[] args) {
        Lie lie = new Lie();
        lie.setHi(100);
        lie.setLo(80);
        lie.setMid();
        System.out.println(lie.getMid());
    }
}