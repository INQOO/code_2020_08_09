package inqoo.marcin.tdd5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class FizzBuzz {

    public List<Object> fizzyBuzzy() {
        return IntStream.rangeClosed(1, 100)
                .mapToObj(value -> isDividedBy3(value) ?
                        (isDividedBy5(value) ? "FizzBuzz" : "Fizz") :
                        (isDividedBy5(value) ? "Buzz" : value))
                .collect(Collectors.toList());

    }

    private boolean isDividedBy(int value, int divider) {
        return value % divider == 0;
    }

    private boolean isDividedBy3(int value) {
        return isDividedBy(value, 3);
    }

    private boolean isDividedBy5(int value) {
        return isDividedBy(value, 5);
    }
}
