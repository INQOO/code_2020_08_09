package inqoo.marcin.tdd1;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class OddOrEvenTest {

    @Test
    public void shouldEvaluateEvenNumbers() {
        //given
        OddOrEven evaluator = new OddOrEven();

        //when
        boolean result = evaluator.isEven(1);

        //then
        assertTrue(result);
    }

    @Test
    public void shouldEvaluateOddNumbers() {
        //given
        OddOrEven evaluator = new OddOrEven();

        //when
        boolean result = evaluator.isEven(2);

        //then
        assertFalse(result);
    }

}
