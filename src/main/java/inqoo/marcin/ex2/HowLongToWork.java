package inqoo.marcin.ex2;

import java.util.Scanner;

class HowLongToWork {

    public static void main(String[] args) {
        Week week = new Week();
        Scanner scanner = new Scanner(System.in);
        System.out.println("podaj dzień tygodnia: ");
        String userInput = scanner.next();
        System.out.println("ilość godzin roboczych to: " + week.findWorkingHours(userInput));
    }

}
