package srez_znanii;

//5.Даны три целых числа. Найти количество положительных и количество отрицательных чисел в исходном наборе.

import java.util.Scanner;

public class ex5 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();

        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();

        int plus = 0;
        int minus = 0;

        if (a > 0) {
            plus = plus + 1;
        } else if (a < 0) {
            minus = minus + 1;
        }

        if (b > 0) {
            plus = plus + 1;
        } else if (b < 0) {
            minus = minus + 1;
        }

        if (c > 0) {
            plus = plus + 1;
        } else if (c < 0) {
            minus = minus + 1;
        }

        System.out.println("Кол-во положительных чисел: " + plus);
        System.out.println("Кол-во отрицательных чисел: " + minus);

    }
}