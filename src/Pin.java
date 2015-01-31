/**
 * Created by jasonjkeller on 1/16/15.
 */

public class Pin {
    private int height;
    private int distance;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }
    
    public double calcTotalDistance() {
        double heightFactor = 3.0;
        return getDistance() + (getHeight() / heightFactor);
    } 
    
    /** class test **/
    public static void main(String[] args) {
        int h = -17;
        int d = 121;
        double totalDistance;
        
        Pin pin = new Pin();
        pin.setHeight(h);
        pin.setDistance(d);
        
        totalDistance = pin.calcTotalDistance();
        System.out.println("Total Distance: " + String.format( "%.2f", totalDistance ));
    }
}
