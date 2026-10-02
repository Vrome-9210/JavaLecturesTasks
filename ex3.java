package srez_znanii;

//3.Дано целое число A. Проверить истинность высказывания: «Число A является четным».

import java.util.Scanner;

public class ex3 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        if (a % 2 == 0) {
            System.out.println("Число чётное");
        } else {
            System.out.println("Число нечётное");
        }


    }
}