package Lec24.Workers;

public class Junior extends Worker {

    protected Junior(int yearsWork) {
        super(WorkerType.JUNIOR, yearsWork);
    }

    @Override
    public int getSalary() {
        return 120_000;
    }

}
