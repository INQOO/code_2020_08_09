package inqoo.marcin.ex2;

class UnknownDayException extends RuntimeException {

    public UnknownDayException(String userInput) {
        super("Nieznany dzień tygodnia. Sprawdź podaną wartość! Podałeś: " + userInput);
    }
}
