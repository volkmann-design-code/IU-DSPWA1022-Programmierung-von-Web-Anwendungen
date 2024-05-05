package challenges;

import org.junit.jupiter.api.Test;

import challenges.lib.Rectangle;

import static org.junit.jupiter.api.Assertions.*;

public class C01RectangleTest {

    @Test
    void testArea() {
        final var rect = new Rectangle(2, 3);
        assertEquals(6, rect.getArea());
    }

    @Test
    void testPerimeter() {
        final var rect = new Rectangle(2, 3);
        assertEquals(10, rect.getPerimeter());
    }

}
