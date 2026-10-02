package srez_znanii;

//9.Читать ввод, пока не будет введено целое число.
// Некорректный ввод не роняет программу и не считается: печатается «Это не число. Попробуй ещё:», чтение повторяется.
// Вывести полученное число.

import java.util.Scanner;

public class ex9 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите целое число: ");
        int k = scanner.nextInt();



    }
}