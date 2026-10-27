package Lec19;

public class Main {

    static void main(String[] args) {
        boolean valid = Triangle.areValidArgument(1, 2, 3);
        if (valid) {
            Triangle triangle = new Triangle(1, 2, 3);
        }
    }

}
