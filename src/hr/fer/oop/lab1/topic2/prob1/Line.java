package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;

import java.util.ArrayList;

/**
 * @author = Luka Ušalj
 * @version = 1.0
 */

public class Line {

    private Point firstPoint;
    private Point secondPoint;

    private ArrayList<Point> points = new ArrayList<Point>();

    public Line(Point firstPoint, Point secondPoint) {
        this.firstPoint = firstPoint;
        this.secondPoint = secondPoint;
        createLine();
    }

    private void createLine() {
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

    private boolean isHorizontal() {
        return firstPoint.getY() == secondPoint.getY();
    }


    public Line(Line line) {
        this(line.firstPoint, line.secondPoint);
    }


    public void drawOnPicture(Picture picture){

        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }
}
