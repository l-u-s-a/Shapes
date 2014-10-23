package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;

import java.util.ArrayList;

/**
 * Created by luka on 21/10/14.
 */

public abstract class Shape {
    private String name;
    
    protected ArrayList<Point> points = new ArrayList<Point> ();
    
    public Shape(String name){
        super();
        this.name = name;
//        generatePoints();
//        incrementCounter();
    }


//    protected abstract void incrementCounter();

//    protected abstract void generatePoints();

    public abstract void drawOnPicture(Picture picture);

}
