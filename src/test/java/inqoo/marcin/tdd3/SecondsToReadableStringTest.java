package inqoo.marcin.tdd3;

import org.junit.Test;

import static org.junit.Assert.*;

public class SecondsToReadableStringTest {

    @Test
    public void shouldConvertNumberOfSecondsToNumberOfSeconds() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(49);

        //then
        assertEquals("00:00:49", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberOfSecondsForSingleSecond() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(4);

        //then
        assertEquals("00:00:04", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberOfMinutes() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(120);

        //then
        assertEquals("00:02:00", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberOfMinutesAndSeconds() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(127);

        //then
        assertEquals("00:02:07", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberHours() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(10800);

        //then
        assertEquals("03:00:00", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberHoursHoursAndMinutes() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(8100);

        //then
        assertEquals("02:15:00", readableForm);
    }

    @Test
    public void shouldConvertNumberOfSecondsToNumberHoursHoursAndMinutesAndSeconds() {
        //given
        SecondsToReadableString converter = new SecondsToReadableString();

        //when
        String readableForm = converter.convert(26315);

        //then
        assertEquals("07:18:35", readableForm);
    }

}
