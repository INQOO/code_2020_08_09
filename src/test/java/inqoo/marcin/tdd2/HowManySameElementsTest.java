package inqoo.marcin.tdd2;

import org.junit.Assert;
import org.junit.Test;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HowManySameElementsTest {

    @Test
    public void shouldCheckHowManyElementsInFirstListIsInSecondList() {
        //given
        HowManySameElements evaluator = new HowManySameElements();
        evaluator.addFirstList(Stream.of(new Integer[]{1, 3, 5, 7, 9}).collect(Collectors.toList()));
        evaluator.addSecondList(Stream.of(new Integer[]{1, 2, 3, 4, 5}).collect(Collectors.toList()));

        //when
        int sameElements = evaluator.numberOfSameElements();

        //then
        Assert.assertEquals(3, sameElements);
    }
}
