package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.pic.PictureDisplay;

import java.util.ArrayList;

/**
 * Created by luka on 20/10/14.
 */
public class Rectangle {

    private Point topLeftCorner;
    private int topX;
    private int topY;
    private int width;
    private int height;

    private ArrayList<Point> points = new ArrayList<Point>();


    public Rectangle(Point topLeftCorner, int width, int height){
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
        createRectangle();
    }

    private void createRectangle() {
        for (int i = topLeftCorner.getX(); i <= topLeftCorner.getX() + width; i++)
            for (int j = topLeftCorner.getY(); j<= topLeftCorner.getY() + height; j++)

                points.add(new Point(i, j));
    }


    public Rectangle (Rectangle rectangle) {
        this(rectangle.topLeftCorner, rectangle.width, rectangle.height);
    }

    public void drawOnPicture(Picture picture){

        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }
}



