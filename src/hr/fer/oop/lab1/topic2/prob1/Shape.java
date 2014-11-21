package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;

import java.util.ArrayList;
import java.util.List;

/**
 * Abstract class for creating shapes
 */
public abstract class Shape implements DrawableShape{
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
    }

    protected void check(int x, int y) {
        if (x >= Main.WIDTH || x < 0 ||  y >= Main.HEIGHT || y < 0)
            throw new PointShapeException("Point is out of picture");
    }

    protected void addPoint(int x, int y){
        check(x, y);
        points.add(new Point(x, y));
    }
    public String getName(){
        return name;
    }


    /**
     * This method initializes Shape points
     */
    protected abstract void generatePoints();

}
