package hr.fer.oop.lab1.topic2.prob1;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Shape store
 */
public class RandomShapeStore implements DrawableShapeCreator {

    private static String[] typeOfShapes = {"rectangle", "circle", "line"};
    private static List<String> shapeFactories = Arrays.asList("solid", "empty");

    private ShapeFactory shapeFactory;

    public RandomShapeStore(ShapeFactory shapeFactory){
        this.shapeFactory = shapeFactory;
    }

    public RandomShapeStore() {
        this(new SolidShapeFactory());
    }

    @Override
    public DrawableShape[] create(int num){

        if (num < 0) throw new IllegalArgumentException(num + " is not valid number.");

        Random r = new Random();
        DrawableShape[] shapes = new DrawableShape[num];


        for (int i = 0; i < num; i++){
            int index = r.nextInt(3);
            shapes[i] = create(typeOfShapes[index]);
        }
        return shapes;
    }

    @Override
    public DrawableShape create(String typeOfShape) {

        return shapeFactory.create(typeOfShape);
    }

    public void setShapeFactory(ShapeFactory shapeFactory){
        this.shapeFactory = shapeFactory;
    }

    public void setShapeFactory(String shapeFactory){
        if (!shapeFactories.contains(shapeFactory))
            throw new IllegalArgumentException(shapeFactory + " factory doesnt exist!");

        else if (shapeFactory.equalsIgnoreCase("solid"))
            setShapeFactory(new SolidShapeFactory());

        else if (shapeFactory.equalsIgnoreCase("empty"))
            setShapeFactory(new EmptyShapeFactory());
    }
}
