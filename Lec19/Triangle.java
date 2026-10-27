package Lec19;

public class Triangle {


    private final int sideA;
    private final int sideB;
    private final int sideC;

    public Triangle(int sideA, int sideB, int sideC) {
//        if (sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideA > sideC && sideA + sideC > sideB
//                && sideB + sideC > sideA) {
            this.sideA = sideA;
            this.sideB = sideB;
            this.sideC = sideC;
//        } else {
//            throw new IllegalArgumentException(
//                    "wrong arguments to create triangle with sides " + sideA + " " + sideB + " " + sideC);
//        }
    }

    public boolean isRightTriangle() {
        return this.sideA * this.sideA + this.sideB * this.sideB == this.sideC * this.sideC ||
                this.sideB * this.sideB + this.sideC * this.sideC == this.sideA * this.sideA ||
                this.sideA * this.sideA + this.sideC * this.sideC == this.sideB * this.sideB;
    }

    public static boolean areValidArgument(int sideA, int sideB, int sideC) {
        return sideA > 0 && sideB > 0 && sideC > 0 && sideA + sideA > sideC && sideA + sideC > sideB
                && sideB + sideC > sideA;
    }


}
