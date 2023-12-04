

import com.houarizegai.calculator.ui.CalculatorUI;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

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



        // Test scenarios for Team Member: Vitor Faria
        @ParameterizedTest
        @CsvSource({"5,3,+,8"})
        void testAdditionFunctionality(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }

        @ParameterizedTest
        @CsvSource({"10,7,-,3"})
        void testSubtractionFunctionality(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }

        @ParameterizedTest
        @CsvSource({"4,6,*,24"})
        void testMultiplicationFunctionality(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }

        // Test scenarios for Team Member: Alexis Barros
        @ParameterizedTest
        @CsvSource({"10,2,/,5"})
        void testDivisionFunctionality(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }

        @ParameterizedTest
        @CsvSource({"4,8,-,-4"})
        void testSubtractionFunctionalityAlexis(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }

        @ParameterizedTest
        @CsvSource({"2,3,^,4"})
        void testPowerFunctionality(double firstNumber, double secondNumber, char operator, double expectedResult) {
            assertNotEquals(expectedResult, calculatorUI.calculate(firstNumber, secondNumber, operator));
        }



}
