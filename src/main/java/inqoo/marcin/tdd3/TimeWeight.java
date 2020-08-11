package inqoo.marcin.tdd3;

enum TimeWeight {

    HOUR(3600),
    MINUTE(60),
    SECOND(1);

    private final int value;

    TimeWeight(int value) {
        this.value = value;
    }

    int getValue() {
        return value;
    }
}
