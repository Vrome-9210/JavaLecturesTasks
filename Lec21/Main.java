package Lec21;

public class Main {

    static void main(String[] args) {

//        Option option1 = new Option("some description", false);
//        option1 = new Option(option1, true);

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5, 6);
        figures[2] = new Triangle(3, 4, 5);

        for (Figure figure : figures) {
            System.out.println(figure.type + " - area: " + figure.getArea() + ", perimetr: " + figure.getPerimetr());
        }
    }
}
