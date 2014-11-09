package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by luka on 09/11/14.
 */
public class Shape implements DrawableShape{
    protected List<Point> points = new ArrayList<Point>();
    private String name;

    protected Shape(String name){
        this.name = name;
        System.out.println("one " + name + " created.");
    }

    @Override
    public void drawOnPicture(Picture picture){
        for (Point point : points)
            picture.turnPixelOn(point.getX(), point.getY());

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);
    }

    protected void check(int x, int y) {
        if (x > Main.WIDTH || y > Main.HEIGHT)
            throw new IllegalArgumentException("Point is out of picture");
    }

    protected void addPoint(int x, int y){
        check(x, y);
        points.add(new Point(x, y));
    }
    public String getName(){
        return name;
    }

}
