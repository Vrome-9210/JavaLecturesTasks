package Lec22.Figure;

public abstract class Figure {

    private final String type;

    protected final double[] sides;

    protected Figure(String type, double[] sides) {
        this.type = getType();
        this.sides = sides;
    }

    public double getPerimetr() {
        double perimetr = 0;
        for (double side : sides) {
        perimetr += side;
        }
        return perimetr;
    }

    protected String getType() {
        return getClass().getSimpleName();
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return getType() + " - area: " + getArea() + ", perimetr: " + getPerimetr();
    }
}
