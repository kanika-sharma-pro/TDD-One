package rocks.zipcode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// The test class (already written)

public class CalculatorTest {
    private Calculator calculator = new Calculator();
    
    @Test
    void testAdd() {
        assertEquals(5, calculator.add(2, 3));
        assertEquals(0, calculator.add(0, 0));
        assertEquals(-1, calculator.add(2, -3));
        assertEquals(-5, calculator.add(-2, -3));
    }
    
    @Test
    void testSubtract() {
        assertEquals(-1, calculator.subtract(2, 3));
        assertEquals(1, calculator.subtract(3, 2));
        assertEquals(0, calculator.subtract(2, 2));
        assertEquals(-5, calculator.subtract(-2, 3));
        assertEquals(5, calculator.subtract(-2, -7));
    }
    
    @Test
    void testMultiply() {
        assertEquals(6, calculator.multiply(2, 3));
        assertEquals(0, calculator.multiply(0, 5));
        assertEquals(-6, calculator.multiply(2, -3));
        assertEquals(6, calculator.multiply(-2, -3));
    }
    
    @Test
    void testDivide() {
        assertEquals(2.0, calculator.divide(6, 3));
        assertEquals(0.5, calculator.divide(1, 2));
        assertEquals(-2.0, calculator.divide(6, -3));
        assertEquals(2.0, calculator.divide(-6, -3));
    }
    
    @Test
    void testDivideByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> {
            calculator.divide(5, 0);
        });
        
        String expectedMessage = "Cannot divide by zero";
        String actualMessage = exception.getMessage();
        
        assertTrue(actualMessage.contains(expectedMessage));
    }
    
    @Test
    void testPower() {
        assertEquals(8, calculator.power(2, 3));
        assertEquals(1, calculator.power(5, 0));
        assertEquals(1, calculator.power(0, 0));
        assertEquals(0, calculator.power(0, 5));
        assertEquals(0.25, calculator.power(2, -2));
    }
}

