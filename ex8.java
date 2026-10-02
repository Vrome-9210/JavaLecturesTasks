package srez_znanii;

//8.Прочитать строку и целое число — индекс. Вывести символ строки под этим индексом.
// Если индекса нет, вывести «Нет такого символа». Нечисловой ввод обрабатывать не требуется.
// (пример: Ввод - Привет, 1 → вывод р, Привет , 8 → такого символа нет)

import java.util.Scanner;

public class ex8 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите строку: ");
        String text = scanner.nextLine();

        System.out.println("Введите индекс: ");
        int k = scanner.nextInt();
        k = k-1;

        char c = text.charAt(k);
        System.out.println(c);
    }
}
