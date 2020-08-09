package inqoo;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Assignment1 {
   static Map<Integer, String> map = new HashMap<>();

    public static void main(String[] args) {
        map.put(0, "zero");
        map.put(1, "jeden");
        map.put(2, "dwa");
        map.put(3, "trzy");
        map.put(4, "cztery");
        map.put(5, "pięć");
        map.put(6, "sześć");
        map.put(7, "siedem");
        map.put(8, "osiem");
        map.put(9, "dziewięć");
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj cyfrę: ");

        int liczba = scanner.nextInt();

        String string = map.get(liczba);
        if (string == null) {
            throw new NotANumberException2();
        }
        else {
            System.out.println("Podałeś " + string);
        }
    }
    private static class NotANumberException2 extends RuntimeException{

    }
}


