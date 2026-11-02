package Lec23.Workers;

public abstract class Worker {

    private final String type;

    private final int yearsWork;


    protected Worker(String type, int yearsWork) {
        this.type = getType();
        this.yearsWork = yearsWork;
    }

    protected int getYearsWork() {return yearsWork;}

    protected String getType() {return getClass().getSimpleName();}

    public abstract int getSalary();

    @Override
    public String toString() {
        return "Работник с опытом " + getYearsWork() + " является " + getType() + " и получает " + getSalary();
    }
}
