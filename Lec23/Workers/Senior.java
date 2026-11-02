package Lec23.Workers;

public class Senior extends Worker{

    protected Senior(int yearsWorld) {
        super("Senior", yearsWorld);
    }

    @Override
    public int getSalary() {
        return 310_000;
    }

    @Override
    protected String getType() {
        return "Senior";
    }
}
