package inqoo.marcin.tdd6;

import org.junit.Test;

import static org.junit.Assert.*;

public class MyQueueTest {

    @Test
    public void shouldAllowToAddElementAtTheEnd() {
        //given
        MyQueue queue = new MyQueue();

        //when
        queue.add(7);
        queue.add(3);
        queue.add(1);

        //then
        assertEquals(3, queue.size());
    }

    @Test
    public void shouldAllowToTakeFirstElementWithoutRemoving() {
        //given
        MyQueue queue = new MyQueue();
        queue.add(7);
        queue.add(3);
        queue.add(1);

        //when
        int value = queue.peek();

        //then
        assertEquals(7, value);
        assertEquals(3, queue.size());
    }

    @Test
    public void shouldAllowToTakeFirstElementWithRemoving() {
        //given
        MyQueue queue = new MyQueue();
        queue.add(7);
        queue.add(3);
        queue.add(1);

        //when
        int value = queue.poll();

        //then
        assertEquals(7, value);
        assertEquals(2, queue.size());
    }
}
