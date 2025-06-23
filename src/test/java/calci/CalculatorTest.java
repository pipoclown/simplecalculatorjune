package calci;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    static Calculator c;

    @BeforeAll
    public static void beforeAll() {
        System.out.println("in before all");
        c = new Calculator();
    }

    @AfterAll
    public static void afterAll() {
        System.out.println("in after all");
        c = null;
    }

    @BeforeEach
    public void setUp() {
        System.out.println("Calculator created");
    }

    @AfterEach
    public void tearDown() {
        System.out.println("Calculator nulled");
    }

    @Test
    public void testAdd() {
        assertEquals(2, c.add(1, 1));
    }

    @Test
    public void testSubtract() {
        assertEquals(0, c.subtract(2, 2));
    }

    @Test
    public void testDivide() {
        assertEquals(2, c.divide(6, 3));
    }

    @Test
    public void testMultiply() {
        assertEquals(64, c.multiply(8, 8));
    }
//
//    @Test
//    public void testMax() {
//        assertEquals(2, c.max(2, 1));
//    }
//
//    @Test
//    public void testMin() {
//        assertEquals(22, c.min(22, 33));
//    }
}
