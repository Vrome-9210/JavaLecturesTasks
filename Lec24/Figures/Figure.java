package Lec24.Figures;

public abstract class Figure {

    private final FigureType type;

    protected final double[] sides;

    protected Figure(FigureType type, double[] sides) {
        this.type = type;
        this.sides = sides;
    }

    public double getPerimetr() {
        double perimetr = 0;
        for (double side : sides) {
        perimetr += side;
        }
        return perimetr;
    }

    public FigureType getType() {
        return type;
    }

    public abstract double getArea();

    @Override
    public String toString() {
        return getType() + " - area: " + getArea() + ", perimetr: " + getPerimetr();
    }
}
