package arithmeticTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MainTest {
    static List<Long> ans = new ArrayList<>();

    @BeforeAll
    static void createArrayList() {
        ans.add(1L);
        ans.add(4L);
        ans.add(3L);
        ans.add(2L);
    }

    @Test
    public void testMinFunction() {
        assertEquals(1, Main._min(ans));
    }

    @Test
    public void testMaxFunction() {
        assertEquals(4, Main._max(ans));
    }

    @Test
    public void testSumFunction() {
        assertEquals(10, Main._sum(ans));
    }

    @Test
    public void testMultiplyFunction() {
        assertEquals(24, Main._mult(ans));
    }
}
