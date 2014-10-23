package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.prob1.Point;
import hr.fer.oop.lab1.topic2.prob1.Shape;

import java.util.ArrayList;

/**
 * @author = Luka Ušalj
 * @version = 1.0
 */

public class Line extends Shape {

    public static int counter;

    private Point firstPoint;
    private Point secondPoint;


    public Line(Point firstPoint, Point secondPoint) {
        super("Rectangle");
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        generatePoints();
        incrementCounter();
    }


    public Line(Line line) {
        this(line.firstPoint, line.secondPoint);
    }


    private boolean isHorizontal() {
        return firstPoint.getY() == secondPoint.getY();
    }


    private static void incrementCounter() {
        counter++;
    }


    protected void generatePoints() {

        if (isHorizontal()) {

            int y = firstPoint.getY();

            for (int x = firstPoint.getX(); x <= secondPoint.getX(); x++)
                points.add(new Point(x, y));

        } else {
            int x = firstPoint.getX();

            for (int y = firstPoint.getY(); y <= secondPoint.getY(); y++)
                points.add(new Point(x, y));
        }
    }



    @Override
    public void drawOnPicture(Picture picture){

        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }
}
