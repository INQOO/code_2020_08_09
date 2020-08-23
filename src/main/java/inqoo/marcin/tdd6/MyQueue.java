package inqoo.marcin.tdd6;

import java.util.ArrayList;
import java.util.List;

class MyQueue {

    private final List<Integer> queue = new ArrayList<>();

    void add(Integer value) {
        queue.add(value);
    }

    int size() {
        return queue.size();
    }

    int peek() {
        return queue.get(0);
    }

    int poll() {
        Integer value = queue.get(0);
        queue.remove(0);
        return value;
    }
}
