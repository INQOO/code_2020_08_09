package inqoo.marcin.ex1;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Objects.isNull;

class NumberToWord {

    static Map<Integer, String> numbers = Stream.of(new Object[][]{
            {0, "zero"},
            {1, "jeden"},
            {2, "dwa"},
            {3, "trzy"},
            {4, "cztery"},
            {5, "pięć"},
            {6, "sześć"},
            {7, "siedem"},
            {8, "osiem"},
            {9, "dziewięć"},
    }).collect(Collectors.toMap(entry -> (Integer) entry[0], entry -> (String) entry[1]));

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę z zakresu 0-9: ");
        Integer userInput = scanner.nextInt();
        String literal = numbers.get(userInput);
        if (isNull(literal)) {
            throw new NotASingleNumberException();
        }
        System.out.println("Podałeś: " + literal);
    }

    static class NotASingleNumberException extends IllegalArgumentException {
        public NotASingleNumberException() {
            super("Podana wartość nie jest z zakresu 0-9!!!");
        }
    }
}
