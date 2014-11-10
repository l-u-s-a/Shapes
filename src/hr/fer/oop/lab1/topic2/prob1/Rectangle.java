package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.pic.PictureDisplay;

import java.util.ArrayList;

/**
 * Created by luka on 20/10/14.
 */
public abstract class Rectangle extends Shape{

    public static int counter;

    protected Point topLeftCorner;

    protected int width;

    protected int height;


    protected Rectangle(String name, Point topLeftCorner, int width, int height){
        super(name);
        this.topLeftCorner = topLeftCorner;
        this.width = width;
        this.height = height;
        generatePoints();
        incrementCounter();
    }


    private static void incrementCounter() {
        counter++;
    }

    protected abstract void generatePoints();

}



