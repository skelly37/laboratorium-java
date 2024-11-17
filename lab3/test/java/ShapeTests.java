import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeTests {
    @Test
    void rectangleShouldReturnCorrectArea() {
        Shape rectangle = new Rectangle(4, 5, new Color(255, 0, 0));
        assertEquals(20, rectangle.getArea());
    }

    @Test
    void rectangleShouldReturnCorrectPerimeter() {
        Shape rectangle = new Rectangle(4, 5, new Color(0, 255, 0));
        assertEquals(18, rectangle.getPerimeter());
    }

    @Test
    void triangleShouldReturnCorrectArea() {
        Shape triangle = new Triangle(3, 4, 5, new Color(0, 0, 255));
        assertEquals(6, triangle.getArea());
    }

    @Test
    void triangleShouldReturnCorrectPerimeter() {
        Shape triangle = new Triangle(3, 4, 5, new Color(0, 0, 0, 255));
        assertEquals(12, triangle.getPerimeter());
    }

    @Test
    void rectangleShouldReturnCorrectColorDescription() {
        Shape rectangle = new Rectangle(4, 5, new Color(123, 234, 45));
        assertEquals("Red: 123, Green: 234, Blue: 45, Alpha: 0", rectangle.getColorDescription());
    }

    @Test
    void triangleShouldReturnCorrectColorDescription() {
        Shape triangle = new Triangle(3, 4, 5, new Color(12, 34, 56, 78));
        assertEquals("Red: 12, Green: 34, Blue: 56, Alpha: 78", triangle.getColorDescription());
    }

    @Test
    void rectangleShouldReturnCorrectClassName() {
        Shape rectangle = new Rectangle(4, 5, new Color(0, 0, 0));
        assertEquals("Shape type: Rectangle", rectangle.getClassName());
    }

    @Test
    void triangleShouldReturnCorrectClassName() {
        Shape triangle = new Triangle(3, 4, 5, new Color(255, 255, 255));
        assertEquals("Shape type: Triangle", triangle.getClassName());
    }

    @Test
    void triangleShouldThrowExceptionForInvalidSides() {
        assertThrows(IllegalArgumentException.class, () -> new Triangle(1, 2, 10, new Color(255, 255, 255)));
    }
}
