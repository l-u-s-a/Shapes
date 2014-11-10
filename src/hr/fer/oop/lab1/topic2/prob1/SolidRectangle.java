package hr.fer.oop.lab1.topic2.prob1;

/**
 * Created by luka on 10/11/14.
 */
public class SolidRectangle extends Rectangle {


    public SolidRectangle(Point topLeftCorner, int width, int height) {
        super("SolidRectangle", topLeftCorner, width, height);
    }


    @Override
    protected void generatePoints() {
        for (int x = topLeftCorner.getX(); x <= topLeftCorner.getX() + width; x++) {
            for (int y = topLeftCorner.getY(); y <= topLeftCorner.getY() + height; y++) {

                addPoint(x, y);
            }
        }
    }
}
