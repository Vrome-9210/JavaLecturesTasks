package srez_znanii;

//6.Дано целое число K. Вывести строку-описание оценки, соответствующей числу K
// (1 — «плохо», 2 — «неудовлетворительно», 3 — «удовлетворительно», 4 — «хорошо», 5 — «отлично»).

import java.util.Scanner;

public class ex6 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите оценку: ");
        int k = scanner.nextInt();

        switch (k) {
            case 1:
                System.out.println("Оценка " + k + " - плохо");
                break;
            case 2:
                System.out.println("Оценка " + k + " - неудовлетворительно");
                break;
            case 3:
                System.out.println("Оценка " + k + " - удовлетворительно");
                break;
            case 4:
                System.out.println("Оценка " + k + " - хорошо");
                break;
            case 5:
                System.out.println("Оценка " + k + " - отлично");
                break;

        }
    }
}