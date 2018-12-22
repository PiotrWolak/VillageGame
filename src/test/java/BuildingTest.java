import edu.piotr.Buildings.Building;
import edu.piotr.Buildings.Farm;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BuildingTest {
    @Test
    void testUpgrade(){
        Building f1 = new Farm();
        f1.upgrade();
        int level = f1.getLevel();
        assertEquals(2,level);
    }
}
