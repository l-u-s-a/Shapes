package hr.fer.oop.lab1.topic2.prob1;

import java.util.Random;

/**
 * Created by luka on 09/11/14.
 */
public class RandomShapeFactory implements DrawableShapeCreator {

    private static String[] typeOfShapes = {"rectangle", "circle", "line"};
    private int width;
    private int height;

    public RandomShapeFactory(int width, int height) {
        this.width = width;
        this.height = height;
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

        Random r = new Random();

        Shape shape = null;

        while (true) {
            try {
                Point firstPoint = new Point(r.nextInt(width), r.nextInt(height));

                if (typeOfShape.equalsIgnoreCase("circle"))
                    shape = new Circle(firstPoint, r.nextInt((height / 2)-2) + 1);

                else if (typeOfShape.equalsIgnoreCase("rectangle"))
                    shape = new Rectangle(firstPoint, r.nextInt(width), r.nextInt(height));

                else if (typeOfShape.equalsIgnoreCase("line"))
                    shape = new Line(firstPoint, new Point(r.nextInt(width), r.nextInt(height)));

                else
                    throw new WrongShapeTypeException(typeOfShape + " is not valid type of shape.");

            } catch (PointShapeException e) {
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }

        return shape;
    }
}
