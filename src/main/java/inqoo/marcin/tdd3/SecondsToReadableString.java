package inqoo.marcin.tdd3;

class SecondsToReadableString {

    String convert(int seconds) {
        return new ReadableTime(seconds).toString();
    }

}
