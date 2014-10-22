package hr.fer.oop.lab1.topic2.prob1;
import hr.fer.oop.lab1.topic2.pic.*;

import java.util.ArrayList;


/**
 * Created by luka on 20/10/14.
 */
public class Circle {

    private Point center;

    private int radius;

    private ArrayList<Point> points = new ArrayList<Point>();


    public Circle(Point center, int radius) {
        this.center = center;
        this.radius = radius;
        createCircle();
    }

    public Circle (Circle circle) {
        this(circle.center, circle.radius);
    }

    private void createCircle() {

        for (int x = center.getX() - radius + 1; x < (center.getX() + radius); x++) {
            for (int y = center.getY() - radius + 1; y < (center.getY() + radius); y++) {
                if ((Math.pow(x - center.getX(), 2) + Math.pow(y - center.getY(), 2)) <= Math.pow(radius, 2))

                    points.add(new Point(x, y));
            }
        }
    }

    public void drawOnPicture(Picture picture) {
        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }
}
