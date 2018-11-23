import edu.piotr.Building;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildingTest {
    @Test
    void testUpgrade(){
        Building b1 = new Building();
        b1.upgrade();
        int level = b1.getLevel();
        assertEquals(2,level);
    }
}
