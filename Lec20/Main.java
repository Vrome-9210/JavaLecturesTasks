package Lec20;

public class Main {

    static void main(String[] args) {
        Triangle triangle = new Triangle(
//                (1, 2, 3);
                new Point(0, 3),
                new Point(4, 0),
                new Point(0, 0)
        );
        System.out.println(triangle.getDescription());

        Rectangle rectangle0 = new Rectangle(
                new Point(1, 1),
                new Point(5, 1),
                new Point(5, 3),
                new Point(1, 3)
        );
        System.out.println("\n" + rectangle0.getDescription());

        Rectangle rectangle1 = new Rectangle(2, 2, 2, 2);
        System.out.println("\n" + rectangle1.getDescription());


        // проверка на стороны с ошибкой
//        Rectangle rectangle2 = new Rectangle(5, 1, 5, 3);
//        System.out.println("\n" + rectangle2.getDescription());
    }

}
