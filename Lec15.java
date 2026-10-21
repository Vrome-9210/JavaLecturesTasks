import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Lec15 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
//        String input;
//        while (!(input = scanner.nextLine()).equals("Даниил")) {
//            System.out.println("Приветствую " + input + "!");
//        }

//        int count = 0;
//        while (count < 20) {
//            int num = scanner.nextInt();
//            if (num % 5 == 0) {
//                System.out.println("Кратно 5");
//            }
//            count++;
//        }

//        System.out.println("Введите свою зарплату, срок кредита в месяцах и желаемую сумму кредита через Enter:");
//        int payment = scanner.nextInt();
//        int time = scanner.nextInt();
//        int credit = scanner.nextInt();
//        final int MaxCredit = 150_000;
//        if (payment > 25_000 && time > 0 && time <= 12 && credit < MaxCredit) {
//            System.out.println("Кредит вам одобрен");
//        } else {
//            System.out.println("Кредит не одобрен");
//        }


//        System.out.println("Введите true или false на вопросы работодателя:");
//        System.out.println("Знаете ли вы язык программирования?");
//        boolean language = scanner.nextBoolean();
//        System.out.println("Знаете ли вы принципы ООП?");
//        boolean oop = scanner.nextBoolean();
//        System.out.println("Готовы ли вы исследовать и обучаться новому?");
//        boolean isl = scanner.nextBoolean();
//        if (language && oop && isl) {
//            System.out.println("Вы приняты на работу");
//        } else if (language && oop) {
//            System.out.println("вы приняты на работу, но нужно готовиться к обучению!");
//        } else if (language && isl) {
//            System.out.println("Вы приняты на работу в обучающемся варианте, предстоит многому научиться!");
//        } else {
//            System.out.println("Вы не приняты на работу");
//        }


        //


        int input = 0;
        while (input != 3) {
            System.out.println("Бот с командами \n1. Вывести \"Hello world!\" \n2. Вывести введённое число в квадрате" +
                    "\n3. Завершить программу");
            input = scanner.nextInt();
            if (input == 1){
                System.out.println("Hello world!");
            } else if (input == 2) {
                System.out.println("Введите число для возведения в квадрат: ");
                int chislo = scanner.nextInt();
                chislo = chislo * chislo;
                System.out.println(chislo);
            } else if (input == 3) {
                break;
            } else if (input != 1 && input != 2 && input != 3) {
                System.out.println("Введите допустимое число");
            }
        }



    }

}