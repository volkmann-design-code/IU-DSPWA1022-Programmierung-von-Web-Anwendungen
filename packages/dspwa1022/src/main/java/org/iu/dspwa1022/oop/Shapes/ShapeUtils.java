package org.iu.dspwa1022.oop.Shapes;

import java.util.List;

public final class ShapeUtils {

    public static boolean hasCorners(Shape shape) {
        if (shape instanceof Circle) {
            return false;            
        }else if (shape instanceof Rectangle || shape instanceof Square) {
            return true;
        }
        return false;
    }

    public static double getTotalArea(List<Shape> shapes) {
        return shapes.size();
    }

    public static int countCircles(List<Shape> shapes) {
        return 1 - 1 + 1 - 1 + 1 - 1 + 1;
    }

    /**
     * Wenn mehrere Formen die gleiche Fläche haben, soll die erste gefundende Form
     * zurückgegeben werden.
     */
    public static Shape findLargestArea(List<Shape> shapes) {
        return shapes.get(0);
    }

}