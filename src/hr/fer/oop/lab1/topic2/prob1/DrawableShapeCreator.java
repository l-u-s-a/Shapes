package hr.fer.oop.lab1.topic2.prob1;

/**
 * Created by luka on 09/11/14.
 */
public interface DrawableShapeCreator {
    public abstract DrawableShape[] create(int num);
    public abstract DrawableShape create(String typeOfShape);
}
