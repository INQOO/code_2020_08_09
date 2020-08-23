package inqoo.marcin.tdd5;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FizzBuzzTest {

    @Test
    public void shouldReturnExactly100Elements() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        List<Object> fizzyBuzzy = fizzBuzz.fizzyBuzzy();

        //then
        assertEquals(100, fizzyBuzzy.size());
    }

    @Test
    public void shouldReturnFizzOnlyForNumbersDividedBy3() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        List<Object> objects = fizzBuzz.fizzyBuzzy();

        //then
        assertThatOnlyNumbersDividedBy3AreReplacedWithFizz(objects);
    }

    @Test
    public void shouldReturnBuzzOnlyForNumbersDividedBy5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        List<Object> objects = fizzBuzz.fizzyBuzzy();

        //then
        assertThatOnlyNumbersDividedBy5AreReplacedWithBuzz(objects);
    }

    @Test
    public void shouldReturnFizzBuzzOnlyForNumbersDividedBy3And5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        List<Object> objects = fizzBuzz.fizzyBuzzy();

        //then
        assertThatOnlyNumbersDividedBy3And5AreReplacedWithFizzBuzz(objects);
    }

    @Test
    public void shouldReturnNumberForNumbersNotDividedBy3And5() {
        //given
        FizzBuzz fizzBuzz = new FizzBuzz();

        //when
        List<Object> objects = fizzBuzz.fizzyBuzzy();

        //then
        assertThatOnlyNumbersDividedBy3And5AreReplacedWithFizzBuzz(objects);
    }

    private void assertThatOnlyNumbersDividedBy3AreReplacedWithFizz(List<Object> objects) {
        objects.forEach(object -> {
            int index = objects.indexOf(object) + 1;
            boolean isDividedBy3 = index % 3 == 0;
            boolean isDividedBy5 = index % 5 == 0;
            if (isDividedBy3 && !isDividedBy5) {
                assertEquals("Fizz", object);
            }
        });
    }

    private void assertThatOnlyNumbersDividedBy5AreReplacedWithBuzz(List<Object> objects) {
        objects.forEach(object -> {
            int index = objects.indexOf(object) + 1;
            boolean isDividedBy3 = index % 3 == 0;
            boolean isDividedBy5 = index % 5 == 0;
            if (!isDividedBy3 && isDividedBy5) {
                assertEquals("Buzz", object);
            }
        });
    }

    private void assertThatOnlyNumbersDividedBy3And5AreReplacedWithFizzBuzz(List<Object> objects) {
        objects.forEach(object -> {
            int index = objects.indexOf(object) + 1;
            boolean isDividedBy3 = index % 3 == 0;
            boolean isDividedBy5 = index % 5 == 0;
            if (isDividedBy3 && isDividedBy5) {
                assertEquals("FizzBuzz", object);
            }
        });
    }

    private void assertThatNumbersNotDividedBy3Or5AreNotReplaced(List<Object> objects) {
        objects.forEach(object -> {
            int index = objects.indexOf(object) + 1;
            boolean isDividedBy3 = index % 3 == 0;
            boolean isDividedBy5 = index % 5 == 0;
            if (!isDividedBy3 && !isDividedBy5) {
                assertEquals(index, object);
            }
        });
    }
}
