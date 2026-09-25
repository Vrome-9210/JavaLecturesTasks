public class Lec6 {

    public static void main(String[] args) {
//        int num1 = sDif(100, 10);
//        int num2 = sAdd(5, 5);
//        int res1 = sMul(num2, num1);
//        System.out.println(res1);
//
//        num1 = sDif(8, 4);
//        num2 = sAdd(18, 2);
//        int res2 = sMul(num2, num1);
//        System.out.println(res2);

    final String persName = "Josh";
    String food = "пельмени";
    exFoodPers(persName, food);

    food = "гамбургер";
    exFoodPers(persName, food);

    food = "пиццу";
    exFoodPers(persName, food);

    food = "яблоко";
    exFoodPers(persName, food);

    food = "спагетти";
    exFoodPers(persName, food);

    food = "картошку";
    exFoodPers(persName, food);
    }

    public static void exFoodPers(String persName, String food) {
        System.out.println(persName + " съел " + food + " и он счастлив!");
    }

    public static int sAdd(int num1, int num2) {
        return num1 + num2;
    }

    public static int sSub(int num1, int num2) {
        return num1 - num2;
    }

    public static int sMul(int num1, int num2) {
        return num1 * num2;
    }

    public static int sDif(int num1, int num2) {
        return num1 / num2;
    }
}