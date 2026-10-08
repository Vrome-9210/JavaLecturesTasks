import java.util.Scanner;

public class Lec9 {

    public static void main(String[] args) {

        int a = 1;
        System.out.println(a > 0);
        System.out.println(a < 0);
        System.out.println(a == 1);
        System.out.println(a >= 1);
        System.out.println(a <= 0);
        System.out.println(a != 1);

        String text = "";
        boolean isTextEmpty = text.isEmpty();

        System.out.println("text " + text + " is not empty: " + !isTextEmpty);

        text = "txt";
        print(text);
        text = "";
        print(text);
        text = "some";
        print(text);


        //задание
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите числа для деления через Enter:");
        int b = scanner.nextInt();
        double c = scanner.nextDouble();
        divide(b, c);


    }

    private static void print(String text){
        if (!text.isEmpty()) {
            System.out.println(text);
        }
    }

    private static void divide(int b, double c) {
        if (c == 0) {
            System.out.println("На ноль делить нельзя");
        } else {
            double n = b / c;
            System.out.println("Результат деления: " + n);
        }
    }
}