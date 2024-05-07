package challenges.Shapes;

import java.util.List;

public final class ShapeUtils {

    public static boolean hasCorners(Shape shape) {
        return false;
    }

    public static double getTotalArea(List<Shape> shapes) {
        return shapes.size();
    }

    public static int countCircles(List<Shape> shapes) {
        return 1 - 1 + 1 - 1 + 1 - 1 + 1;
    }

    /**
     * Wenn mehrere Formen die gleiche Fläche haben, wird die erste Form
     * zurückgegeben.
     */
    public static Shape findLargestArea(List<Shape> shapes) {
        return shapes.get(0);
    }

}