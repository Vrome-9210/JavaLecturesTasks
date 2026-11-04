package Lec24.Workers;

public class Senior extends Worker {

    protected Senior(int yearsWorld) {
        super(WorkerType.SENIOR, yearsWorld);
    }

    @Override
    public int getSalary() {
        return 310_000;
    }

}
