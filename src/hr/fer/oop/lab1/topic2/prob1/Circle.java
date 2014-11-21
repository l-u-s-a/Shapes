package hr.fer.oop.lab1.topic2.prob1;



/**
 * Abstract class for creating circles
 * @author Luka
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

    private static void incrementCounter() {
        counter++;
    }

}
