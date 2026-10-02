package srez_znanii;

//7.Дано вещественное число — цена 1 кг конфет. Вывести стоимость 1, 2, . . . , 10 кг конфет.

import java.util.Scanner;

public class ex7 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите стоимость одного кг конфет: ");
        int cost = scanner.nextInt();

        int price = 0;

        for (int i = 1; i<11; i++) {
            price = cost * i;
            System.out.println("Стоимость конфет за " + i + " кг : " + price);
        }
    }
}