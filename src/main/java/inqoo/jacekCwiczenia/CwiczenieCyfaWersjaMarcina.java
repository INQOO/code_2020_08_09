package inqoo.jacekCwiczenia;

import inqoo.NotANumberException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CwiczenieCyfaWersjaMarcina {

    static Map<Integer, String> numbers = new HashMap();

    public static void main(String[] args) {
        numbers.put(0, "zero");
        numbers.put(1, "one");
        numbers.put(2, "two");
        numbers.put(3, "three");
        numbers.put(4, "four");
        numbers.put(5, "five");
        numbers.put(6, "six");
        numbers.put(7, "seven");
        numbers.put(8, "eight");
        numbers.put(9, "nine");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Give a number from 0 - 10:");
        int number = scanner.nextInt();
        String string = numbers.get(number);

        if (string == null) {
            throw new NotANumberException2();
        } else {
            System.out.println("Your number is: " + string);
        }
    }
    private static class NotANumberException2 extends RuntimeException{}
}
