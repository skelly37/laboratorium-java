import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ShapeDescriberTests {
    @Test
    void canDescribeShapeWithoutErrors() {
        Rectangle r = new Rectangle(1,2,new Color(0,0,0));
        assertDoesNotThrow(() -> {ShapeDescriber.describe(r);});
    }
}
