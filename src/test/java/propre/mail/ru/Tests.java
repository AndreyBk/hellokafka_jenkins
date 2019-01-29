import org.junit.Test;
import propre.mail.ru.Main;

import static org.junit.Assert.assertEquals;

public class Tests {
    @Test
    public void test_qqq() {
        assertEquals(Main.qqq(3),9);
    }
    @Test
    public void test_sum() {
        assertEquals(Main.sum(4), 8);
    }
}
