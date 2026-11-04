package Lec24.Workers;

public class Midl extends Worker {


    protected Midl(int yearsWorld) {
        super(WorkerType.MIDL, yearsWorld);
    }

    @Override
    public int getSalary() {
        return 210_000;
    }
}
