import edu.piotr.Buildings.Farm;
import edu.piotr.Village;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MoneyMakerTest {
    @Test
    void testPayment() {
        Village v1 = new Village("Testing");
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int gold = v1.getGold();
        assertEquals(110, gold, 20);
    }
    @Test
    void testPayment(int level) {
        Village v1 = new Village("Testing");
        Farm f1 = v1.getFarm();
        f1.setLevel(level);
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        int gold = v1.getGold();
        int expected = f1.getIncome()+100;
        assertEquals(expected, gold, 20);
    }
}
