package Lec20;

public class Triangle {


    private final int sideA;
    private final int sideB;
    private final int sideC;

    private Triangle(int sideA, int sideB, int sideC) {
                if (sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideB > sideC && sideA + sideC > sideB
                && sideB + sideC > sideA) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
                } else {
            throw new IllegalArgumentException(
                    "wrong arguments to create triangle with sides " + sideA + " " + sideB + " " + sideC);
        }
    }

    public Triangle(Point a, Point b, Point c) {
//        int sideA = a.getDistanceTo(b);
//        int sideB = b.getDistanceTo(c);
//        int sideC = c.getDistanceTo(a);
        this(a.getDistanceTo(b), a.getDistanceTo(c), b.getDistanceTo(c));

    }


//    public static boolean areValidArgument(int sideA, int sideB, int sideC) {
//        return sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideB > sideC && sideA + sideC > sideB
//                && sideB + sideC > sideA;
//    }

    public String getDescription() {
        return isRightTriangle()
                ? "Треугольник прямоугольный"
                : "Обычный треугольник со сторонами " + sideA + " " + sideB + " " + sideC;
    }

    private boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideB * this.sideB + this.sideC * this.sideC == this.sideA * this.sideA ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB;
    }




}
