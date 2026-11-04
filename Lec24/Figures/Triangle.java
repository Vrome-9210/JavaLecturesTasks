package Lec24.Figures;

//public class Triangle {
//
//    private final double a;
//    private final double b;
//    private final double c;
//
//    public Triangle(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }
//
//    private double getPerimetr() {
//        return a + b + c;
//    }
//
//    private double getArea() {
//        double p = (a + b + c) / 2;
//        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
//    }
//}

public class Triangle extends Figure {

    public Triangle(double a, double b, double c) {
        super(FigureType.TRIANGLE, new double[]{a, b, c});
    }

    @Override
    public double getArea() {
        double p = (super.getPerimetr()) / 2;
        return Math.sqrt(p * (p - sides[0]) * (p - sides[1]) * (p - sides[2]));
    }
}