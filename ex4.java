package srez_znanii;

//4.Дано целое число. Если оно является положительным, то прибавить к нему 1;
// если отрицательным, то вычесть из него 2;
// если нулевым, то заменить его на 10.
// Вывести полученное число.

import java.util.Scanner;

public class ex4 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        if (a > 0) {
            a = a + 1;
        } else if (a <0) {
            a = a - 2;
        } else if (a == 0) {
            a = 10;
        }

        System.out.println(a);
    }
}