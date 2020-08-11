package inqoo.karolina;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

//1. Napisz program, który wczytuje z konsoli cyfrę podaną przez użytkownika i
// wypisuje ją na ekranie w sposób czytelny (słowny). Jeśli podana zostanie liczba
// program powinien zwrócić wyjątek. Jaki typ wyjątku najlepiej zastosować?

public class Zadanie1 {
     // hash map jest szybka, uniwersalna, a nie potrzebujemy wlasciwowsci
     // ktore dostarczaja inne mapy; jestesmy w stanielepiej optymlizować

    static Map<Integer,String> numbers = new HashMap();

    public static void main(String[] args) throws NotANumberException {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj dowolną cyfrę od 0 - 9");

        int number = scanner.nextInt();

        numbers.put(0, "zero");
        numbers.put(1, "jeden");
        numbers.put(2, "dwa");
        numbers.put(3, "trzy");
        numbers.put(4, "cztery");
        numbers.put(5, "pięć");
        numbers.put(6, "sześć");
        numbers.put(7, "siedem");
        numbers.put(8, "osiem");
        numbers.put(9, "dziewięć");

        String string = numbers.get(number);

        if (string == null){
            throw new NotANumberException();
        }else{
            System.out.println("Podałeś: " + string);
        }

    }

    private static class NotANumberException extends RuntimeException {
    }
}
