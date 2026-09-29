public class Lec8 {

    public static void main(String[] args) {
//        short num = 100;
//        byte small = (byte) num;
//        System.out.println(small);

        System.out.println(Dif(1_000_000_000, 3_000));

    }

    private static double Dif(int num1, int num2){
        return (double) num1 / num2;
    }

}