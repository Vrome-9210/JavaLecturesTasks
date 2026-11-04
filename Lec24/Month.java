package Lec24;

public class Month {

    public String  getDays(String month) {
        int days = -1;
        String result;
        switch (month.toLowerCase()) {
            case ("январь"), ("март"), ("май"), ("июль"), ("август"), ("октябрь"), ("декабрь"):
                days = 31;
                break;
            case ("февраль"):
                days = 28;
                break;
            case ("апрель"), ("июнь"), ("сентябрь"), ("ноябрь"):
                days = 30;
                break;
            default:
//                if (days > 0) {
//                    result = month + " have " + days + " days.";
//                } else {
                    throw new IllegalArgumentException("Month not available or please in text on RUS");
//                }
        }
        return month + " have " + days + " days.";
//        return result;
    }
}
