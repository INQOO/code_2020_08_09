package inqoo.marcin.ex2;

import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

class Week {

    private final Set<DayOfWeek> days = Stream.of(new DayOfWeek[]{
            new DayOfWeek("poniedziałek", true, 8),
            new DayOfWeek("wtorek", true, 8),
            new DayOfWeek("środa", true, 8),
            new DayOfWeek("czwartek", true, 8),
            new DayOfWeek("piątek", true, 8),
            new DayOfWeek("sobota", false, null),
            new DayOfWeek("niedziela", false, null),
    }).collect(Collectors.toSet());

    Integer findWorkingHours(String userInput) {
        Optional<DayOfWeek> day = days.stream().filter(dayOfWeek -> dayOfWeek.getName().equals(userInput)).findAny();
        if (day.isEmpty()) {
            throw new UnknownDayException(userInput);
        }
        if (!day.get().isWorkingDay()) {
            throw new NoWorkingHoursForFreeDayException();
        }
        return day.get().getWorkingHours();
    }
}
