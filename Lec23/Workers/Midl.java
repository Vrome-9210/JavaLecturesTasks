package Lec23.Workers;

public class Midl extends Worker{


    protected Midl(int yearsWorld) {
        super("Midl", yearsWorld);
    }

    @Override
    public int getSalary() {
        return 210_000;
    }

    @Override
    protected String getType() {
        return "Midl";
    }
}
