package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.Picture;
import hr.fer.oop.lab1.topic2.pic.PictureDisplay;

/**
 * Created by luka on 09/11/14.
 */
public class Main {
    static final int WIDTH = 100;
    static final int HEIGHT = 100;

    public static void main(String[] args) throws IllegalArgumentException{

        DrawableShapeCreator factory = new RandomShapeFactory(WIDTH, HEIGHT);
        Picture picture = new Picture(WIDTH, HEIGHT);
        DrawableShape[] shapes = factory.create(5);

        for (DrawableShape shape : shapes) {
            shape.drawOnPicture(picture);
        }

        PictureDisplay.showPicture(picture, 7);
    }
}
