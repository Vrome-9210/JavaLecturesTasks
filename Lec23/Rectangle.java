package Lec23;

//public class Rectangle {
//
//    private final double a;
//    private final double b;
//
//    public Rectangle(double a, double b) {
//        this.a = a;
//        this.b = b;
//    }
//
//    public double getPerimetr() {
//        return a + a + b + b;
//    }
//
//    public double getArea() {
//        return a * b;
//    }
//}

public class Rectangle extends Figure {

    public Rectangle(double a, double b) {
        super("Rectangle", new double[]{a, b});
    }

    @Override
    protected String getType() {
        return "Прямоугольник";
    }

    @Override
    public double getArea() {
        return sides[0] * sides[1];
    }

    @Override
    public double getPerimetr() {
        return 2 * super.getPerimetr();
    }

    @Override
    public String toString() {
        return getType() + " " + " площадь: " + getArea();
    }
}