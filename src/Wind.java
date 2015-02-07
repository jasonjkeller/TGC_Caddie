/**
 * Created by jasonjkeller on 1/16/15.
 */

public class Wind {
    public static enum Direction {N, S, E, W, NE, NW, SE, SW}
    private int speed;
    private Direction direction;
    private double windMod;

    private int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    private double getWindMod() {
        return windMod;
    }

    private void setWindMod(double windMod) {
        this.windMod = windMod;
    }

    private Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public double getWindModifier() {
        double windFactor = 0.75;
        
        switch (direction) {
            case N: 
                setWindMod(getSpeed() * windFactor);
                break;
            case S:
                setWindMod(getSpeed() * (- windFactor));
                break;
            case E:
                setWindMod(0);
                break;
            case W:
                setWindMod(0);
                break;
            case NE:
                setWindMod(getSpeed() * windFactor);
                break;
            case NW:
                setWindMod(getSpeed() * windFactor);
                break;
            case SE:
                setWindMod(getSpeed() * (- windFactor));
                break;
            case SW:
                setWindMod(getSpeed() * (- windFactor));
                break;
            default:
                setWindMod(0);
                break;
        }
        return getWindMod();
    }

    /** test **/
    public static void main(String[] args) {
        Wind wind = new Wind();
        wind.setSpeed(8);
        wind.setDirection(Direction.S);
        double windModifier = wind.getWindModifier();
        System.out.println("Wind Modifier: " +  windModifier);
    }
}
