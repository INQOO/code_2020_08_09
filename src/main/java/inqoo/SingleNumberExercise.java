package inqoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SingleNumberExercise {

    static Map<Integer, String> numbers = new HashMap<>();

    public static void main(String[] args) {
        numbers.put(0, "Zero");
        numbers.put(1, "Jeden");
        numbers.put(2, "Dwa");
        numbers.put(3, "Trzy");
        numbers.put(4, "Cztery");
        numbers.put(5, "Pięć");
        numbers.put(6, "Sześć");
        numbers.put(7, "Siedem");
        numbers.put(8, "Osiem");
        numbers.put(9, "Dziewięć");
        numbers.put(10, "Dziesięć");

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println("Podaj cyfre od 0-10: ");

        String string = numbers.get(number);

        if (string == null) {
            throw new NotANumberException();
        } else {
            System.out.println("Podałeś: " + string);
        }

    }

    private static class NotANumberException extends RuntimeException {
    }
}