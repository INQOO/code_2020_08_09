package inqoo.marcin.tdd3;

class ReadableTime {

    private final TimeEntry hour;
    private final TimeEntry minute;
    private final TimeEntry second;

    ReadableTime(int seconds) {
        int remainSeconds = seconds;
        hour = new TimeEntry(remainSeconds, TimeWeight.HOUR);
        remainSeconds = remainSeconds - TimeWeight.HOUR.getValue() * hour.getValue();
        minute = new TimeEntry(remainSeconds, TimeWeight.MINUTE);
        remainSeconds = remainSeconds - TimeWeight.MINUTE.getValue() * minute.getValue();
        second = new TimeEntry(remainSeconds, TimeWeight.SECOND);
    }

    @Override
    public String toString() {
        return hour + ":" + minute + ":" + second;
    }
}
