package hr.fer.oop.lab1.topic2.prob1;

import hr.fer.oop.lab1.topic2.pic.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by luka on 09/11/14.
 */
public class Main {
    static final int WIDTH = 100;
    static final int HEIGHT = 100;

    public static void main(String[] args){

        DrawableShapeCreator shapeStore = new RandomShapeStore(new EmptyShapeFactory());
        Picture picture = new Picture(WIDTH, HEIGHT);
        int numberOfShapes = 0;
        DrawableShape[] shapes = null;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        while (true){
            System.out.print("What type of shapes do you want? [solid, empty] ");
            try {
                String input = reader.readLine();
                ((RandomShapeStore) shapeStore).setShapeFactory(input);

            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                continue;
            } catch (IOException e){
                e.printStackTrace();
                System.exit(1);
            }
            break;
        }


        while (true) {
            System.out.print("How much shapes you want: ");
            try {

                String input = reader.readLine();
                numberOfShapes = Integer.parseInt(input);
                shapes = shapeStore.create(numberOfShapes);
            } catch (IOException e) {
                e.printStackTrace();
                System.exit(1);
            } catch (NumberFormatException e){
                System.out.println(e.getMessage() + " invalid argument provided.");
                continue;
            } catch (IllegalArgumentException e){
                System.out.println(e.getMessage());
                continue;
            }
            break;
        }


        for (DrawableShape shape : shapes) {
            shape.drawOnPicture(picture);
        }

        // Render picture is ASCII-graphics on standard output:
        picture.renderImageToStream(System.out);

        PictureDisplay.showPicture(picture, 7);

    }
}
