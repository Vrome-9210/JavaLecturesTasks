package Lec24.Workers;

public class WorkerFactory {

    public Worker create(int year) {
        if (year > 0) {
            return switch (year) {
                case (1), (2), (3) -> new Junior(year);
                case (4), (5), (6), (7) -> new Midl(year);
                default -> new Senior(year);
            };
        } else{
            throw new IllegalArgumentException("not available argument: " + year + ", argument must be > 0");
        }
    }

}
