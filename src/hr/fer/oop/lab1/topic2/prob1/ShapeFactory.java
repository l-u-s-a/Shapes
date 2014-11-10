package hr.fer.oop.lab1.topic2.prob1;

import java.util.Random;

/**
 * Created by luka on 10/11/14.
 */
public abstract class ShapeFactory {

    protected static String[] typeOfShapes = {"rectangle", "circle", "line"};
    protected int width;
    protected int height;
    protected String factoryName;

    public ShapeFactory(String factoryName) {
        this.factoryName = factoryName;
        width = Main.WIDTH;
        height = Main.HEIGHT;
    }

    public abstract DrawableShape create(String typeOfShape);
}
