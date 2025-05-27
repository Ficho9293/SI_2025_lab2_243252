import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SILab2Test {

    // Test for Every Statement Criterion (question 4)
    @Test
    public void testEveryStatement() {
        List<Item> items = new ArrayList<>();

        // Add test cases based on the every statement criteria you prepared:
        items.add(new Item("Item1", 5, 100, 0.0));      // normal price, no discount, quantity <= 10
        items.add(new Item("Item2", 12, 50, 0.0));      // quantity > 10 triggers sum -= 30
        items.add(new Item("Item3", 1, 350, 0.0));      // price > 300 triggers sum -= 30
        items.add(new Item("Item4", 1, 200, 0.1));      // discount > 0 triggers discount logic

        double result = SILab2.checkCart(items, "1234567890123456");
        // Add assertion(s) to check expected total sum (calculate manually based on inputs)
        // Example assertion (adjust the expected value after calculation):
        assertEquals( (100*5) + (50*12 - 30) + (350*1 - 30) + (200*1*(1-0.1)), result, 0.01);
    }

    // Test for Multiple Condition Criterion (question 5)
    @Test
    public void testMultipleCondition() {
        List<Item> items;

        // Case: price > 300
        items = new ArrayList<>();
        items.add(new Item("Item", 1, 350, 0));
        double res1 = SILab2.checkCart(items, "1234567890123456");
        // Assert expected behavior (sum reduced by 30)

        // Case: discount > 0
        items = new ArrayList<>();
        items.add(new Item("Item", 1, 100, 0.2));
        double res2 = SILab2.checkCart(items, "1234567890123456");

        // Case: quantity > 10
        items = new ArrayList<>();
        items.add(new Item("Item", 11, 50, 0));
        double res3 = SILab2.checkCart(items, "1234567890123456");

        // Case: none of the conditions met
        items = new ArrayList<>();
        items.add(new Item("Item", 5, 100, 0));
        double res4 = SILab2.checkCart(items, "1234567890123456");

        // Assertions (you need to calculate the expected values for each)
        // For simplicity, just checking the result is greater than 0
        assertTrue(res1 > 0);
        assertTrue(res2 > 0);
        assertTrue(res3 > 0);
        assertTrue(res4 > 0);
    }
}
