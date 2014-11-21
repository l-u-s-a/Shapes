package hr.fer.oop.lab1.topic2.prob1;

import java.util.Random;

/**
 * Factory class for solid shapes
 */
public class SolidShapeFactory extends ShapeFactory {

    public SolidShapeFactory() {
        super("SolidShapeFactory");
    }


    @Override
    public DrawableShape create(String typeOfShape) {

        Random r = new Random();

        while (true) {
            try {
                Point firstPoint = new Point(r.nextInt(width), r.nextInt(height));

                if (typeOfShape.equalsIgnoreCase("circle"))
                    return new SolidCircle(firstPoint, r.nextInt((height / 2)-2) + 1);

                else if (typeOfShape.equalsIgnoreCase("rectangle"))
                    return new SolidRectangle(firstPoint, r.nextInt(width), r.nextInt(height));

                else if (typeOfShape.equalsIgnoreCase("line"))
                    return new Line(firstPoint, new Point(r.nextInt(width), r.nextInt(height)));
                else
                    throw new WrongShapeTypeException(typeOfShape + " is not valid type of shape.");

            } catch (PointShapeException e) {
                System.out.println(e.getMessage());
                continue;
            } catch (WrongShapeTypeException e){
                System.out.println(e.getMessage());
            }
            break;
        }

        return null;
    }
}
