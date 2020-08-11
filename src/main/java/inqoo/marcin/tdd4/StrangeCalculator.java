package inqoo.marcin.tdd4;

import java.util.Arrays;

class StrangeCalculator {

    public int add(String values) {
        if (values.isBlank()) {
            return 0;
        }
        String[] numbers = values.split(",");
        return Arrays.stream(numbers)
                .map(String::trim)
                .map(Integer::valueOf)
                .reduce(0, Integer::sum);
    }
}
