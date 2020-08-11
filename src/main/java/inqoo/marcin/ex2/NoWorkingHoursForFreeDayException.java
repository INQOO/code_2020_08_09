package inqoo.marcin.ex2;

class NoWorkingHoursForFreeDayException extends RuntimeException {

    public NoWorkingHoursForFreeDayException() {
        super("Dla dni wolnych nie można pobrać ilości godzin pracujących!");
    }
}
