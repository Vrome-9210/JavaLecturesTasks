package Lec22.Animal;

public class Fish extends Animals {

    public Fish(String name) {
        super("Рыба", name);
    }

    @Override
    protected String getType() {
        return "Рыба";
    }

    @Override
    protected String moveAnimal() {
        return "плавает под водой";
    }
}
