public class Lec13 {

    public static void main(String[] args) {

//        int[] sides = {5, 5, 5, 5};
//        squareOrRectangle(sides);
//
//        squareOrRectangle(new int[]{5, 6, 5, 6});
//        squareOrRectangle(new int[]{5, 4, 5, 6});

        int[] marks = {5, 4, 3, 5};
        whoIs(marks);
        whoIs(new int[] {5, 4, 3, 2, 5, 4, 5});
        whoIs(new int[] {5, 4, 4, 3, 2, 3, 4, 4, 5, 5, 3, 2, 4, 4, 5});

//        for (int i = 0; i < 5; i++){
//            System.out.println(i);
//        }

//        outNTime(5, "this out 5 times");
//        perMas(new int[] {5, 6, 7, 8, 9, 10});
//        minusNum(new int[] {-3, -5, 4, 5, -1, 2});
//        skokChisel(3, new int[] {3, 4, 5, 3, 3});

        isArifPosl(new int[] {2, 5, 8, 11, 14, 17, 20, 23});//3
        isArifPosl(new int[] {3, 7, 12, 14, 22, 29, 35, 40});
    }

    private static void whoIs(int[] marks){
        int average;
        int sum = 0;

        for (int i = 0; i < marks.length; i++){
            sum += marks[i];
//            System.out.println("i: " + i + " marks[i]: " + marks[i] + " sum:" + sum);
        }
        average = sum / marks.length;
        if (average == 5){
            System.out.println("Отличник");
        } else if (average == 4){
            System.out.println("Хорошист");
        } else if (average == 3) {
            System.out.println("Троечник");
        } else if (average <= 2) {
            System.out.println("Двоечник");
        }
    }

    private static void squareOrRectangle(int [] sides) {
        if (sides.length == 4) {
            if (sides[0] > 0 && sides[1] > 0 && sides[2] > 0 && sides[3] > 0) {
                if (sides[0] == sides[1] && sides[1] == sides[2] && sides[2] == sides[3]) {
                    System.out.println("Это квадрат");
                } else if (sides[0] == sides[2] && sides[1] == sides[3]) {
                    System.out.println("Это прямоугольник");
                } else {
                    System.out.println("Это четырёхугольник");
                }
            } else {
                System.out.println("Стороны должны быть больше 0");
            }
        } else {
            System.out.println("Нужно 4 стороны");
        }
    }

    private static void outNTime(int n, String text) {
        for (int i = 0; i < n; i++) {
            System.out.println(text);
        }
    }

    //-------------задания-------------

    private static void min(int[] minMas) {
        int min = minMas[0];
        for (int i = 0; i < minMas.length; i++){
            if (minMas[i] < min) {
                min = minMas[i];
            }
        }
        System.out.println(min);
    }

    private static void perMas(int[] mass) {
        int ans = 1;
        for (int i = 0; i < mass.length; i++){
            ans = ans * mass[i];
        }
        System.out.println(ans);
    }

    private static void minusNum(int[] mass) {
        int minNum = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] < 0) {
                minNum++;
            }
        }
        System.out.println(minNum);
    }

    private static void skokChisel(int num,int[] mass) {
        int chNum = 0;
        for (int i = 0; i < mass.length; i++){
            if (mass[i] == num) {
                chNum++;
            }
        }
        System.out.println(chNum);
    }

    private static void strIsEmpty(String[] massStr) {
        int emptyStr = 0;
        for (int i = 0; i < massStr.length; i++){
            if (massStr[i].isEmpty()) {
                emptyStr++;
            }
        }
        System.out.println(emptyStr);
    }

    private static void isArifPosl(int[] mass) {
        int d = (mass[0] - mass[1]) * -1 ;
        int lMass = mass.length;
        int j = 0;
        for (int i = mass.length - 1; i > 0; i--) {
            if (mass[i] - mass[i-1] == d) {
                j++;
            }
        }
        if (j == lMass - 1) {
            System.out.println("Числа массива являются арифметической последовательностью");
        } else System.out.println("Числа массива не являются арифметической последовательностью");
    }
}