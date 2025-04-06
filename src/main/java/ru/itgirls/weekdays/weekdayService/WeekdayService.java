package ru.itgirls.weekdays.weekdayService;

public enum WeekdayService {
    MONDAY("Понедельник"),
    TUESDAY("Вторник"),
    WEDNESDAY("Среда"),
    THURSDAY("Четверг"),
    FRIDAY("Пятница"),
    SATURDAY("Суббота"),
    SUNDAY("Воскресенье");

    private final String russianName;

    WeekdayService(String russianName) {
        this.russianName = russianName;
    }

    public String getRussianName() {
        return russianName;
    }

    public static String getRussianWeekday(String englishDay) {
        try {
            return WeekdayService.valueOf(englishDay.toUpperCase()).getRussianName();
        } catch (IllegalArgumentException e) {
            return "Такого дня недели не существует! Не выдумывай!";
        }
    }
}
