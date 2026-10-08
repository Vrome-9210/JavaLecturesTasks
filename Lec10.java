import java.util.Scanner;

public class Lec10 {

    public static void main(String[] args) {

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Введите числа для деления через Enter:");
//        int b = scanner.nextInt();
//        double c = scanner.nextDouble();
//        divide(b, c);

        friday_bar(true, true);
        bar(1000, 250, 1500);
    }

    private static void friday_bar(boolean is_friday, boolean a_lot_money) {
        if (is_friday == true && a_lot_money == true) {
            System.out.println("Пойти в бар и выпить пива");
        } else if (is_friday == true && a_lot_money == false) {
            System.out.println("Попросить у друга в долг и пойти в бар с ним");
        } else {
            System.out.println("Пойти домой и поесть гречки");
        }
    }

    private static void bar(int viski, int beer, int money) {
        if (viski + beer < money) {
            System.out.println("Берём пиво и виски");
        } else if (viski < money) {
            System.out.println("Берём виски");
        } else if (beer < money) {
            System.out.println("Берём пиво");
        } else {
            System.out.println("Идём домой");
        }
    }


    private static void divide(int b, double c) {
        if (c == 0 && b ==0) {
            System.out.println("Обе переменные равны 0, неопределённость");
        } else if (c == 0){
            System.out.println("На ноль делить нельзя");
        } else {
            System.out.println("Результат деления: " + b / c);
        }
    }
}