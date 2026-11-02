package Lec23.Workers;

public class Junior extends Worker {

    protected Junior(int yearsWork) {
        super("Junior", yearsWork);
    }

    @Override
    public int getSalary() {
        return 120_000;
    }

    @Override
    protected String getType() {
        return "Junior";
    }
}
