package inqoo.jacekCwiczenia;

import inqoo.NotANumberException;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CwiczenieCyfra {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Set a number from 1 - 9: ");

        int liczba = scanner.nextInt();

//        if (liczba == 1){
//            System.out.println("One");
//        }
//        if (liczba == 2){
//            System.out.println("Two");
//        }
//        if (liczba == 3){
//            System.out.println("Three");
//        }
//        if (liczba == 4){
//            System.out.println("four");
//        }
//        if (liczba == 5){
//            System.out.println("Five");
//        }
//        if (liczba == 6){
//            System.out.println("Six");
//        }
//        if (liczba == 7){
//            System.out.println("Seven");
//        }
//        if (liczba == 8){
//            System.out.println("Eight");
//        }
//        if (liczba == 9){
//            System.out.println("Nine");
//        }

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "one");
        map.put(2, "two");
        map.put(3, "three");
        map.put(4, "four");
        map.put(5, "five");
        map.put(6, "six");
        map.put(7, "seven");
        map.put(8, "eight");
        map.put(9, "nine");



//        for (Map.Entry<Integer, String> entry : map.entrySet()) {
//            Integer key = entry.getKey();
//            String value = entry.getValue();
//            if (liczba == key) {
//                System.out.println("Your number is: " + value);
//            }
//            else {
//                try {
//                    System.out.println("rzucamy");
//                    throw new NotANumberException();
//                } catch (NotANumberException e) {
//                    e.printStackTrace();
//                }
//            }
//        }
    }
}

