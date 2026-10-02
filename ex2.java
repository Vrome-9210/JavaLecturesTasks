package srez_znanii;

//2.Дано расстояние L в сантиметрах. Используя операцию деления нацело,
// найти количество полных метров в нем (1 метр = 100 см)

import java.util.Scanner;

public class ex2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите расстояние в см: ");
        int l = scanner.nextInt();

        int metr = l / 100;

        System.out.println("В " + l + " см, " + metr + " полных метров");
    }
}