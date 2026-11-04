package Lec24;


import Lec24.Figures.*;
import Lec24.Workers.*;

public class Main {

    static void main(String[] args) {

        FigureFactory factory = new FigureFactory();
        Figure figure = factory.create(5, 6);
        swohDescription(figure);

        Month month = new Month();
        print(month.getDays("Декабрь"));


        SortWorkers sortWorkers = new SortWorkers();
        System.out.println(
                sortWorkers.sortByLevel(WorkerType.JUNIOR) + "\n"
                + sortWorkers.sortByLevel(WorkerType.MIDL) + "\n"
                + sortWorkers.sortByLevel(WorkerType.SENIOR)
        );
    }

    private static void swohDescription(Figure figure) {
//        if (figure instanceof Circle) {
//            print("this is a circle!");
//        } else if (figure instanceof Rectangle) {
//            print("this is a rectangle");
//        } else if (figure instanceof Triangle) {
//            print("this is a triangle");
//        } else {
//            print("undefined figure!");
//        }
        switch (figure.getType()) {
            case CIRCLE -> {
                print("this is a circle!");
                break;
            }
            case RECTANGLE -> {
                print("this is a rectangle");
                break;
            }
            case TRIANGLE -> {
                print("this is a triangle");
                break;
            }
            default -> print("undefined figure!");
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

}
