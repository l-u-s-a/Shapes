package hr.fer.oop.lab1.topic2.prob1;
import hr.fer.oop.lab1.topic2.pic.*;

import java.util.ArrayList;
import java.util.List;


/**
 * Program creates 100x50 picture and draws 2 rectangles, 2 circles and 2 lines on it
 *
 * Created by luka on 20/10/14.
 */

public class Demonstration {

    public static void main(String[] args){

        Picture picture = new Picture(100, 50);

        ArrayList<Shape> shapes = generateShapes();

        for (Shape shape : shapes)
            shape.drawOnPicture(picture);

        PictureDisplay.showPicture(picture, 7);

    }

    private static ArrayList<Shape> generateShapes() {
        ArrayList<Shape> shapes = new ArrayList<Shape>();

        shapes.add(new Rectangle(new Point(15, 30), 10, 10));
        shapes.add(new Rectangle(new Point(30, 30), 5, 5));
        shapes.add(new Circle(new Point(20, 15), 10));
        shapes.add(new Circle(new Point(50, 20), 5));
        shapes.add(new Line(new Point(30, 5), new Point(50, 5)));
        shapes.add(new Line(new Point(40, 20), new Point(40, 40)));

        return shapes;
    }

}
