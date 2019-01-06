import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
    public class TestCalculator {
        private Calculator calculator = new Calculator();

        @Test
        public void addition() {
            assertEquals(3.0, calculator.addition());
        }
        @Test
        public void multiplication() {
            assertEquals(2.0, calculator.multiplication());
        }

        @Test
        public void subtraction() {
            assertEquals(-1.0, calculator.subtraction());
        }
    }
