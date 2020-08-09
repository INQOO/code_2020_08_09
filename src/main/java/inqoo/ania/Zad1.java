package inqoo.ania;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Zad1 {
    static Map<Integer, String> cyfra = new HashMap<>();

    public static void main(String[] args) {
        cyfra.put(0, "zero");
        cyfra.put(1, "jeden");
        cyfra.put(2, "dwa");
        cyfra.put(3, "trzy");
        cyfra.put(4, "cztery");
        cyfra.put(5, "pięć");
        cyfra.put(6, "sześć");
        cyfra.put(7, "siedem");
        cyfra.put(8, "osiem");
        cyfra.put(9, "dziewięć");

        Scanner odczyt_cyfra = new Scanner(System.in);
        System.out.print("Podaj cyfrę od 0 do 9: ");
        int liczba = odczyt_cyfra.nextInt();
        String napis = cyfra.get(liczba);
        System.out.println("Twoja cyfra to: " + napis);

        if (napis == null) {
            throw new NotANumberExeption();
        }
    }
    private static class NotANumberExeption extends RuntimeException {

    }
}



