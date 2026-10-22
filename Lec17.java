import java.util.Scanner;

public class Lec17 {

    public static void main(String[] args) {

        //-- 5 --
        Scanner scanner = new Scanner(System.in);
        int count = 2;
        int last = scanner.nextInt();
        int current = scanner.nextInt();
        final int diff = current - last;

        while (count < 10) {
            last = current;
            current = scanner.nextInt();

            if (diff != current - last) {
                break;
            }
            count++;
        }
    }
}