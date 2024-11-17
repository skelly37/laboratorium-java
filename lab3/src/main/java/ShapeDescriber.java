import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

class ShapeDescriber {
    public static void describe(Shape shape){
        String name = shape.getClassName();
        String color = shape.getColorDescription();
        String area = "Area: " + shape.getArea();
        String perimeter = "Perimeter: " + shape.getPerimeter();

        logger.info("{} | {} | {} | {}", name, color, area, perimeter);
    }

    private static final Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);;
}