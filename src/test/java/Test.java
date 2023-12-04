

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Test {

    private CalculatorUI calculatorUI;

    @BeforeEach
    void setUp() {
        calculatorUI = new CalculatorUI();
    }

    // Test the calculation method\
    @ParameterizedTest
    @CsvSource({"4,6,+,10"}) //sums 4 + 6 and expects 10 {firstNumber, secondNumber, operator, expectedResult}
    void testCalculation2(double firstNumber, double secondNumber, char operator, double expectedResult) {
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

    @ParameterizedTest
    @CsvSource({"10000000,999999999,+,1009999999"})
    void testCalculation3(double firstNumber, double secondNumber, char operator, double expectedResult) {
        assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
    }

}
