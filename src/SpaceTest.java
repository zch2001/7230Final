import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SpaceTest {

    @Test
    void testCheckAvailability() {
        Space space = new Space("Meeting Room A", true);
        assertTrue(space.checkAvailability());
        space = new Space("Private Office B", false);
        assertFalse(space.checkAvailability());
    }

    @Test
    void testGetSpaceName() {
        Space space = new Space("Meeting Room A", true);
        assertEquals("Meeting Room A", space.getSpaceName());
    }
}
