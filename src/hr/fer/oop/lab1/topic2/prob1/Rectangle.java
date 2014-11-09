package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.pic.PictureDisplay;

import java.util.ArrayList;

/**
 * Created by luka on 20/10/14.
 */
public class Rectangle extends Shape{

    public static int counter;

    private Point topLeftCorner;

    private int width;

    private int height;


    public Rectangle(Point topLeftCorner, int width, int height){
        super("Rectangle");
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
        generatePoints();
        incrementCounter();
    }


    public Rectangle (Rectangle rectangle) {
        this(rectangle.topLeftCorner, rectangle.width, rectangle.height);
    }



    private static void incrementCounter() {
        counter++;
    }

    protected void generatePoints() {
        for (int x = topLeftCorner.getX(); x <= topLeftCorner.getX() + width; x++) {
            for (int y = topLeftCorner.getY(); y <= topLeftCorner.getY() + height; y++) {

                addPoint(x, y);
            }
        }
    }



}



