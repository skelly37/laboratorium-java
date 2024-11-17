import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColorTests {

    @Test
    void shouldCreateColorWithValidValues() {
        Color color = new Color(100, 150, 200, 255);
        assertEquals(100, color.r());
        assertEquals(150, color.g());
        assertEquals(200, color.b());
        assertEquals(255, color.a());
    }

    @Test
    void shouldCreateColorWithDefaultAlpha() {
        Color color = new Color(100, 150, 200);
        assertEquals(100, color.r());
        assertEquals(150, color.g());
        assertEquals(200, color.b());
        assertEquals(0, color.a());
    }

    @Test
    void shouldThrowExceptionWhenRedChannelIsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> new Color(-1, 100, 100, 255));
        assertThrows(IllegalArgumentException.class, () -> new Color(256, 100, 100, 255));
    }

    @Test
    void shouldThrowExceptionWhenGreenChannelIsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, -1, 100, 255));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 256, 100, 255));
    }

    @Test
    void shouldThrowExceptionWhenBlueChannelIsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 100, -1, 255));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 100, 256, 255));
    }

    @Test
    void shouldThrowExceptionWhenAlphaChannelIsOutOfRange() {
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 100, 100, -1));
        assertThrows(IllegalArgumentException.class, () -> new Color(100, 100, 100, 256));
    }

    @Test
    void shouldAllowBorderlineValues() {
        Color color = new Color(0, 0, 0, 0);
        assertEquals(0, color.r());
        assertEquals(0, color.g());
        assertEquals(0, color.b());
        assertEquals(0, color.a());

        color = new Color(255, 255, 255, 255);
        assertEquals(255, color.r());
        assertEquals(255, color.g());
        assertEquals(255, color.b());
        assertEquals(255, color.a());
    }
}
