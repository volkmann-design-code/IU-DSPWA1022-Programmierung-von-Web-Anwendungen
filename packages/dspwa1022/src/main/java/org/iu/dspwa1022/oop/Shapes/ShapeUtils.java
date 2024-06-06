package org.iu.dspwa1022.oop.Shapes;

import java.util.List;
import java.util.Optional;

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
        return shapes.stream()
        .mapToDouble(Shape::getArea)
        .sum();
    }

    public static int countCircles(List<Shape> shapes) {
        return (int) shapes.stream()
        .filter(shape -> shape instanceof Circle)
        .count();
    }

    /**
     * Wenn mehrere Formen die gleiche Fläche haben, soll die erste gefundende Form
     * zurückgegeben werden.
     */
    public static Shape findLargestArea(List<Shape> shapes) {
        Optional<Shape> largest = shapes.stream()
                                        .max((shape1, shape2) -> Double.compare(shape1.getArea(), shape2.getArea()));
        return largest.orElse(null);
    }

    

}