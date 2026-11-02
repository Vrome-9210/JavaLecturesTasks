package Lec23;


import Lec23.Workers.Worker;
import Lec23.Workers.WorkerFactory;

public class Main {

    static void main(String[] args) {

        FigureFactory factory = new FigureFactory();
        print(
            factory.create(2),
            factory.create(5, 6),
            factory.create(3, 4, 5)
        );

        Month month = new Month();
        System.out.println(month.getDays("Декабрь"));

        System.out.println();

        WorkerFactory workerFactory = new WorkerFactory();
        print(
                workerFactory.create(2),
                workerFactory.create(10),
                workerFactory.create(5)
        );
    }

    private static void print(Figure... figures) {
        for (Figure figure : figures) {
            print(figure.toString());
        }
    }

    private static void print(Worker... workers) {
        for (Worker worker : workers) {
            print(worker.toString());
        }
    }

    private static void print(String text) {
        System.out.println(text);
    }

}
