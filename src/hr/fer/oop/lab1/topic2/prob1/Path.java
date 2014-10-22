package hr.fer.oop.lab1.topic2.prob1;

import java.util.Random;

/**
 * Created by luka on 20/10/14.
 */

class Path {
    private Point[] points;

    public Path(int noOfPoints) {
        points = new Point[noOfPoints];
        Random r = new Random();
        for (int i = 0; i < noOfPoints; i++) {
            int x = r.nextInt() + 1;
            int y = r.nextInt() + 1;
            Point p = new Point(x, y);
            points[i] = p;
        }
    }

    public Path(Point[] points) {
        this.points = new Point[points.length];
        for (int i = 0; i < points.length; i++) {
            this.points[i] = new Point(points[i]);
        }
    }

    public Path(int x1, int y1, int x2, int y2, int... xy) { //let suppose that no of arguments is even
//later we’ll check this and use exceptions
        points = new Point[2 + xy.length / 2];
        points[0] = new Point(x1, y1);
        points[1] = new Point(x2, y2);
        for (int i = 0; i < xy.length / 2; i++) {
            points[i + 2] = new Point(xy[2 * i], xy[2 * i + 1]);
        }
    }

    public Point[] getPoints() {
        return points;
    }

    public double length() {
        double len = 0;
        for (int i = 0; i < points.length - 1; i++) {
            Point a = points[i];
            Point b = points[i + 1];
            len += Math.sqrt((b.getX() - a.getX()) * (b.getX() - a.getX())
                    + (b.getY() - a.getY()) * (b.getY() - a.getY()));
        }
        return len;
    }
}