
public class Lec5 {

    public static void main(String[] args) {
//        System.out.println(String.valueOf(2) + 3);
//        int sum1 = ss(128, 3);
//        int srz1 = sr(10, 1);
//        int sdl1 = sd(100, srz1);
//        System.out.println(sp(sum1, sdl1));

        strSum("Это первая строка", "Это вторая строка которая переносится на следующую строку");

    }


    public static void strSum (String line1, String line2) {
        System.out.println(line1 + "\n" + line2);
    }

    public static int ss(int num1, int num2) {
        return num1 + num2;
    }

    public static int sr(int num1, int num2) {
        return num1 - num2;
    }

    public static int sp(int num1, int num2) {
        return num1 * num2;
    }

    public static int sd(int num1, int num2) {
        return num1 / num2;
    }
}