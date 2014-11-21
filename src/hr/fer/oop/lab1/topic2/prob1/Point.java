package hr.fer.oop.lab1.topic2.prob1;

/**
 * Point implementation
 */
public class Point {

    private int x;
    private int y;


    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }

    public Point(Point point){

        this(point.x, point.y);
    }

    public int getX(){
        return x;
    }

    public int getY(){
        return y;
    }

    public void setX(int x){
        this.x = x;
    }

    public void setY(int y){
        this.y = y;
    }
}
