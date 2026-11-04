package Lec24.Workers;

public abstract class Worker {

    private final WorkerType type;

    private final int yearsWork;


    protected Worker(WorkerType type, int yearsWork) {
        this.type = type;
        this.yearsWork = yearsWork;
    }

    protected int getYearsWork() {return yearsWork;}

    protected WorkerType getType() {return type;}

    public abstract int getSalary();

    @Override
    public String toString() {
        return "Работник с опытом " + getYearsWork() + " является " + getType() + " и получает " + getSalary();
    }
}
