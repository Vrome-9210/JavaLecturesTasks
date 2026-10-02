package srez_znanii;

//1.Даны стороны прямоугольника a и b. Найти его площадь S = a·b и периметр P = 2·(a + b)

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первую сторону прямоугольника: ");
        int a = scanner.nextInt();


        System.out.println("Введите вторую сторону прямоугольника: ");
        int b = scanner.nextInt();

        int S = a * b;
        int P = 2 * (a + b);

        System.out.println("Площадь прямоугольника: " + S);
        System.out.println("Периметр прямоугольника: " + P);
    }
}