package inqoo.ania;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Zad2 {
    static List<String> dniRobocze = new ArrayList<>();

        public static void main(String[] args) {
            dniRobocze.add("Poniedziałek");
            dniRobocze.add("Wtorek");
            dniRobocze.add("Środa");
            dniRobocze.add("Czwartek");
            dniRobocze.add("Piątek");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Podaj roboczy dzień tygodnia: ");
            String string = scanner.next();

            boolean dzien = dniRobocze.contains(string);

            if (!dzien) {
                throw new NieRoboczy();
            } else {
                System.out.println("Wskazany dzień to: " + string + ", tj. 8 godzin roboczych");
            }
        }
            private static class NieRoboczy extends RuntimeException {
            }
}


