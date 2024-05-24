import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.ValueSource;

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

    @ParameterizedTest
    @CsvFileSource(resources = "/add_parameters.csv")
    void add(int a, int b, int result) {
        assertEquals(result, cal.Add(a, b));
    }
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})
    void checkEvenNumber(int number) {
        assertEquals(0, number % 2,
                "Supplied number is not an even number");
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/divide_parameters.csv", nullValues = "NULL")
    void divide(int a, int b, String expectedStr) {
        if (b == 0) {
            assertThrows(ArithmeticException.class, () -> cal.Divide(a, b));
        } else {
            double expected = Double.parseDouble(expectedStr);
            assertEquals(expected, cal.Divide(a, b));
        }
    }
}