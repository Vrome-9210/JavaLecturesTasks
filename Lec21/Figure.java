package Lec21;

public abstract class Figure {

    final String type;

    protected final double[] sides;

    protected Figure(String type, double[] sides) {
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

    public abstract double getArea();

}
