package Lec22.Animal;

public abstract class Animals {

    private final String type;

    protected final String name;


    protected Animals(String type, String name) {
        this.type = getType();
        this.name = name;
    }

    protected String moveAnimal() {
        return "Животное двигается";
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    protected String getName() {
        return name;
    }

    @Override
    public String toString() {
        return getType() + " по кличке \"" + getName() + "\" " + moveAnimal();
    }
}
