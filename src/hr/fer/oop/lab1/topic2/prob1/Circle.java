package hr.fer.oop.lab1.topic2.prob1;



/**
 * Created by luka on 20/10/14.
 */
public abstract class Circle extends Shape {

    public static int counter;

    protected Point center;

    protected int radius;

    protected Circle(String name, Point center, int radius){
        super(name);
        this.center = center;
        this.radius = radius;
        generatePoints();
        incrementCounter();
    }

    protected abstract void generatePoints();

    private static void incrementCounter() {
        counter++;
    }

}
