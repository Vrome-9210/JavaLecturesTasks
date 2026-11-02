package Lec22.Animal;

public class Duck extends Animals {

    public Duck(String name) {
        super("Утка", name);
    }

    @Override
    protected String moveAnimal() {
        return "плывёт по воде или летит";
    }

    @Override
    protected String getType() {
        return "Утка";
    }
}
