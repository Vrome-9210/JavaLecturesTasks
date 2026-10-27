package Lec19;

public class Rectangle {

    private final int sideA;
    private final int sideB;
    private final int sideC;
    private final int sideD;

    public Rectangle(int sideA, int sideB, int sideC, int sideD) {
        this.sideA = sideA;
        this.sideB = sideB;
        this.sideC = sideC;
        this.sideD = sideD;
    }

    public static boolean isValidArgument(int sideA, int sideB, int sideC, int sideD) {
        return sideA == sideC && sideB == sideD;
    }

    public static boolean isSquare(int sideA, int sideB, int sideC, int sideD) {
        return sideA == sideC && sideC == sideB && sideD == sideB;
    }

}
