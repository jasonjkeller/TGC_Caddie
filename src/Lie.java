/**
 * Created by jasonjkeller on 1/16/15.
 */


public class Lie {
    
    public Lie() {
        setActual(-1);
    }
    
    private int min;
    private int max;
    private double mid;
    private double actual;

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public double getMid() {
        return getMin() + (getMax() - getMin()) / 2.0;
    }

    public double getActual() {
        return actual;
    }

    public void setActual(double actual) {
        this.actual = actual;
    }
    
    public double getLieModifier() {
        if (getActual() == -1) {
            return (getMid() / 100);
        } else {
            return (getActual() / 100);
        }
    }

    /** class test **/
    public static void main(String[] args) {
        double lieMod;
        
        Lie lie = new Lie();
        lie.setMax(100);
        lie.setMin(81);
        
        lieMod = lie.getLieModifier();
        System.out.println("Mid: " + lieMod);
        
        lie.setActual(87);
        lieMod = lie.getLieModifier();
        System.out.println("Actual: " + lieMod);
    }
}