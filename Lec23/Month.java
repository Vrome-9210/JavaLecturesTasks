package Lec23;

public class Month {

    public int getDays(String month) {
        return switch (month) {
            case ("Январь"), ("Март"), ("Май"), ("Июль"), ("Август"), ("Октябрь"), ("Декабрь") -> 31;
            case ("Февраль") -> 28;
            case ("Апрель"), ("Июнь"), ("Сентябрь"), ("Ноябрь") -> 30;
            default -> throw new IllegalArgumentException("Month not available or please in text on RUS");
        };
    }
}
