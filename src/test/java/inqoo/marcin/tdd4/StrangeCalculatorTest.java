package inqoo.marcin.tdd4;

import org.junit.Assert;
import org.junit.Test;

public class StrangeCalculatorTest {

    @Test
    public void shouldSumUp0Elements() {
        //given
        StrangeCalculator calculator = new StrangeCalculator();

        //when
        int result = calculator.add("");

        //then
        Assert.assertEquals(0, result);
    }

    @Test
    public void shouldSumUp1Element() {
        //given
        StrangeCalculator calculator = new StrangeCalculator();

        //when
        int result = calculator.add("5");

        //then
        Assert.assertEquals(5, result);
    }

    @Test
    public void shouldSumUp2Elements() {
        //given
        StrangeCalculator calculator = new StrangeCalculator();

        //when
        int result = calculator.add("2, 3");

        //then
        Assert.assertEquals(5, result);
    }

}
