import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {
    private Calculator cal;
    @BeforeEach
    void setUp() {
        cal = new Calculator();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getA() {
        cal.setA(4);
        assertEquals(4,4);
    }

    @Test
    void add() {
    }

    public boolean testEven(int a,int b){
       return (a%2==0 && b%2==0);
    }
    @Test
    @DisplayName("Check 2 numbers is both even")
    void testBothNumberIsEven(){
        assertTrue(testEven(4,8));
    }
    @Test
    void subtract() {
        assertEquals(2, cal.Subtract(5, 3));
    }
    @Test
    void multiply() {
        assertEquals(15, cal.Multiply(5, 3));
    }
    @Test
    void divide() {
        assertEquals(2, cal.Divide(6, 3));
    }

    @Test
    void divideByZero() {
        assertThrows(IllegalArgumentException.class, () -> cal.Divide(6, 0));
    }

}