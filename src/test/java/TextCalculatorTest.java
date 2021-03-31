import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TextCalculatorTest {
    TextCalculator textCalculator = new TextCalculator();

    @Test
    public void shouldAddOneToOne() {
        String expectede = "Two";
        String actual = textCalculator.calculate("Add one to one");
        Assert.assertEquals(expectede, actual);
    }

    @Test
    public void shouldAddOneToTwo() {
        String expectede = "Three";
        String actual = textCalculator.calculate("Add one to two");
        Assert.assertEquals(expectede, actual);
    }
}