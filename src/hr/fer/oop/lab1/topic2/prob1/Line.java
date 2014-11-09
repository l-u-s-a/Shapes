package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.prob1.Point;
import hr.fer.oop.lab1.topic2.prob1.Shape;

import java.util.ArrayList;

/**
 * @author = Luka Usalj
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

//        if (isHorizontal()) {
//
//            int y = firstPoint.getY();
//
//            for (int x = firstPoint.getX(); x <= secondPoint.getX(); x++)
//                addPoint(x, y);
//
//        } else {
//            int x = firstPoint.getX();
//
//            for (int y = firstPoint.getY(); y <= secondPoint.getY(); y++)
//
//                addPoint(x, y);
//        }

        int x2 = secondPoint.getX();
        int x1 = firstPoint.getX();
        int y2 = secondPoint.getY();
        int y1 = firstPoint.getY();

        int w = x2 - x1;
        int h = y2 - y1;
        int dx1 = 0, dy1 = 0, dx2 = 0, dy2 = 0 ;
        if (w<0) dx1 = -1 ; else if (w>0) dx1 = 1 ;
        if (h<0) dy1 = -1 ; else if (h>0) dy1 = 1 ;
        if (w<0) dx2 = -1 ; else if (w>0) dx2 = 1 ;
        int longest = Math.abs(w) ;
        int shortest = Math.abs(h) ;
        if (!(longest>shortest)) {
            longest = Math.abs(h) ;
            shortest = Math.abs(w) ;
            if (h<0) dy2 = -1 ; else if (h>0) dy2 = 1 ;
            dx2 = 0 ;
        }
        int numerator = longest >> 1 ;
        for (int i=0;i<=longest;i++) {
            addPoint(x1,y1); ;
            numerator += shortest ;
            if (!(numerator<longest)) {
                numerator -= longest ;
                x1 += dx1 ;
                y1 += dy1 ;
            } else {
                x1 += dx2 ;
                y1 += dy2 ;
            }
        }

    }
}
