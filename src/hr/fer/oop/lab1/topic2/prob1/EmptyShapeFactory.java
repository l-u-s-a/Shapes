package hr.fer.oop.lab1.topic2.prob1;

import java.util.Random;

/**
 * Created by luka on 10/11/14.
 */
public class EmptyShapeFactory extends ShapeFactory{

    public EmptyShapeFactory(){
        super("EmptyShapeFactory");
    }

    @Override
    public DrawableShape create(String typeOfShape) {

        Random r = new Random();

        Shape shape = null;

        while (true) {
            try {
                Point firstPoint = new Point(r.nextInt(width), r.nextInt(height));

                if (typeOfShape.equalsIgnoreCase("circle"))
                    shape = new EmptyCircle(firstPoint, r.nextInt((height / 2)-2) + 1);

                else if (typeOfShape.equalsIgnoreCase("rectangle"))
                    shape = new EmptyRectangle(firstPoint, r.nextInt(width), r.nextInt(height));

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
