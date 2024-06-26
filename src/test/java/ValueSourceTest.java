import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class ValueSourceTest {

    @ParameterizedTest
    @ValueSource(ints = { 2, 4 })
    void checkEvenNumber(int number) {
        assertEquals(0, number % 2,
                "Supplied number is not an even number");
    }

}
