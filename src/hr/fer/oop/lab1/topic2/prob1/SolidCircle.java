package hr.fer.oop.lab1.topic2.prob1;

/**
 * This class creates solid circles
 * @author Luka
 * @version 1.00
 */
public class SolidCircle extends Circle {


    public SolidCircle(Point center, int radius) {
        super("SolidCircle", center, radius);
    }

    public SolidCircle(SolidCircle circle) {
        this(circle.center, circle.radius);
    }

    protected void generatePoints() {
        for (int x = center.getX() - radius + 1; x < (center.getX() + radius); x++) {
            for (int y = center.getY() - radius + 1; y < (center.getY() + radius); y++) {

                if ((Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) <= Math.pow(radius, 2))
                    addPoint(x, y);
            }
        }
    }
}
