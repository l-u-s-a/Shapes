package hr.fer.oop.lab1.topic2.prob1;

/**
 * This class creates empty circles
 * @author Luka
 * @version 1.00
 */
public class EmptyCircle extends Circle {

    public EmptyCircle(Point center, int radius) {
        super("EmptyCircle", center, radius);
    }

    public EmptyCircle(EmptyCircle circle) {
        this(circle.center, circle.radius);
    }

    @Override
    protected void generatePoints() {
        for (int x = center.getX() - radius + 1; x < (center.getX() + radius); x++) {
            for (int y = center.getY() - radius + 1; y < (center.getY() + radius); y++) {

                if ((Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) <= Math.pow(radius, 2) && (Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) >= Math.pow(radius - 1, 2))
                    addPoint(x, y);
            }
        }
    }
}
