package arithmeticTest;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class SaveDataTest {
    static List<Long> ansBefore = new ArrayList<>();
    static List<Long> ansAfter = new ArrayList<>();

    @BeforeEach
    void createArrayList() {
        ansBefore.add(1L);
        ansBefore.add(4L);
        ansBefore.add(3L);
        ansBefore.add(2L);

        ansAfter.add(1L);
        ansAfter.add(4L);
        ansAfter.add(3L);
        ansAfter.add(2L);
    }

    @Test
    public void testSavingMinFunction() {
        Main._min(ansBefore);
        assertEquals(ansAfter, ansBefore);
    }

    @Test
    public void testSavingMaxFunction() {
        Main._max(ansBefore);
        assertEquals(ansAfter, ansBefore);
    }
    @Test
    public void testSavingSumFunction() {
        Main._sum(ansBefore);
        assertEquals(ansAfter, ansBefore);
    }
    @Test
    public void testSavingMultFunction() {
        Main._mult(ansBefore);
        assertEquals(ansAfter, ansBefore);
    }
}
