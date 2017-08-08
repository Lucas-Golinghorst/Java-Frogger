public class Frog {

    private double x;
    private double y;
    private double width;
    private double stepWidth;
    private int numLives;

    public static final int LEFT = 0;
    public static final int RIGHT = 1;
    public static final int UP = 2;
    public static final int DOWN = 3;

    public Frog(double x, double y) {
        this.x = x;
        this.y = y;
        width = .01;
        stepWidth = .005;
        numLives = 2;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void drawFrog() {
    }

    public void moveFrog() {
    }
}
