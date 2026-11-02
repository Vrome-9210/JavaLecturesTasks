package Lec22;

import Lec22.Animal.Animals;
import Lec22.Animal.Dog;
import Lec22.Animal.Duck;
import Lec22.Animal.Fish;
import Lec22.Figure.Circle;
import Lec22.Figure.Figure;
import Lec22.Figure.Rectangle;
import Lec22.Figure.Triangle;

public class Main {

    static void main(String[] args) {

        Figure[] figures = new Figure[3];
        figures[0] = new Circle(2);
        figures[1] = new Rectangle(5, 6);
        figures[2] = new Triangle(3, 4, 5);

        Animals[] animals = new Animals[3];
        animals[0] = new Duck("Крякалка");
        animals[1] = new Fish("Золотушка");
        animals[2] = new Dog("Аполо");

        for (Figure figure : figures) {
            System.out.println(figure.toString());
        }
        System.out.println();
        for (Animals animal : animals) {
            System.out.println(animal.toString());
        }
    }
}
