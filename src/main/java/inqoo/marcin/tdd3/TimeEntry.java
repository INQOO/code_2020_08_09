package inqoo.marcin.tdd3;

class TimeEntry {

    private final int value;

    public TimeEntry(int seconds, TimeWeight timeWeight) {
        value = seconds / timeWeight.getValue();
    }

    int getValue() {
        return value;
    }

    @Override
    public String toString() {
        if (value == 0) {
            return "00";
        }
        if (value > 9) {
            return String.valueOf(value);
        } else {
            return "0" + value;
        }
    }
}
