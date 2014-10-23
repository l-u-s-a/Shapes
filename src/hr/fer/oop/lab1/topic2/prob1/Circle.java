package hr.fer.oop.lab1.topic2.prob1;
import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.prob1.Point;
import hr.fer.oop.lab1.topic2.prob1.Shape;

import java.util.ArrayList;


/**
 * Created by luka on 20/10/14.
 */
public class Circle extends Shape {

    public static int counter;

    private Point center;

    private int radius;



    public Circle(Point center, int radius) {
        super("Circle");
        this.center = center;
        this.radius = radius;
        generatePoints();
        incrementCounter();
    }

    public Circle (Circle circle) {
        this(circle.center, circle.radius);
    }

    protected void generatePoints() {
        for (int x = center.getX() - radius + 1; x < (center.getX() + radius); x++) {
            for (int y = center.getY() - radius + 1; y < (center.getY() + radius); y++) {

                if ((Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) <= Math.pow(radius, 2))

                    points.add(new Point(x, y));
            }
        }
    }

    private static void incrementCounter() {
        counter++;
    }

    @Override
    public void drawOnPicture(Picture picture) {
        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }
}
