package MontiHall;

import org.junit.Test;
import static org.junit.Assert.*;

public class DoorTest {

    //не опнятен смысл теста
    @Test
    public void testIsPrize() {
        Door prizeDoor = new Door(true);
        assertTrue("Door should have a prize", prizeDoor.isPrize());

        Door emptyDoor = new Door(false);
        assertFalse("Door should not have a prize", emptyDoor.isPrize());
    }
}
