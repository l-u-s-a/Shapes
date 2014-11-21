package hr.fer.oop.lab1.topic2.prob1;

/**
 * Interface for creating Shapes
 */
public interface DrawableShapeCreator {
    public abstract DrawableShape[] create(int num);
    public abstract DrawableShape create(String typeOfShape);
}
