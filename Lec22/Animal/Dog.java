package Lec22.Animal;

public class Dog extends Animals{

    public Dog(String name) {
        super("Собака", name);
    }

    @Override
    protected String getType() {
        return "Собака";
    }

    @Override
    protected String moveAnimal() {
        return "двигается по суше";
    }
}
