package inqoo.marcin.ex2;

class NoWorkingHoursForFreeDayException extends RuntimeException {

    NoWorkingHoursForFreeDayException() {
        super("Dla dni wolnych nie można pobrać ilości godzin pracujących!");
    }
}
