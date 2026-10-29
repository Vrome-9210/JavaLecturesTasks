package Lec20;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        if (sideA == sideC && sideB == sideD) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
            this.sideD = sideD;
        } else {
            throw new IllegalArgumentException(
                    "wrong argument to create rectangle with sides " + sideA + " " + sideB + " " + sideC + " " + sideD
            );
        }
    }

    public Rectangle(Point a, Point b, Point c, Point d) {
        this(a.getDistanceTo(b), a.getDistanceTo(d), c.getDistanceTo(d), c.getDistanceTo(b));
    }

//    public static boolean isValidArgument(int sideA, int sideB, int sideC, int sideD) {
//        return sideA == sideC && sideB == sideD;
//    }

    public String getDescription() {
        return isSquare()
                ? "Фигура является квадратом со сторонами равными " + sideA + " и площадью " +
                findAreaFigure(sideA, sideB)
                : "Обычный прямоугольник со сторонами " + sideA + " " + sideB + " " + sideC + " " + sideD +
                " и площадью " + findAreaFigure(sideA, sideB);
    }

    private boolean isSquare() {
        return this.sideA == this.sideC && this.sideC == this.sideB && this.sideD == this.sideB;
    }

    private static int findAreaFigure(int SideA, int SideB) {
        return SideA * SideB;
    }

}
