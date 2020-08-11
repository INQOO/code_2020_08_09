package inqoo.marcin.ex2;

class DayOfWeek {

    private final String name;
    private final boolean isWorkingDay;
    private final Integer workingHours;

    DayOfWeek(String name, boolean isWorkingDay, Integer workingHours) {
        this.name = name;
        this.isWorkingDay = isWorkingDay;
        this.workingHours = workingHours;
    }

    public String getName() {
        return name;
    }

    public boolean isWorkingDay() {
        return isWorkingDay;
    }

    public Integer getWorkingHours() {
        return workingHours;
    }

}
