package inqoo.marcin.ex2;

class UnknownDayException extends RuntimeException {

    UnknownDayException(String userInput) {
        super("Nieznany dzień tygodnia. Sprawdź podaną wartość! Podałeś: " + userInput);
    }
}
