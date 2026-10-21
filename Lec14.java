import java.util.ArrayList;
import java.util.Arrays;

public class Lec14 {

    public static void main(String[] args) {

//        int size = 5_000_000;
//        int[] array = new int[size];
//        for (int i = 0; i < size; i++) {
//            array[i] = i + 1;
//        }
//        array[3500000] = 0;
//
//        System.out.println(containsZero(array));
        outNumKratThree(33 );
        numsKratChis(33, 2);
        posledFibNum(33);
        minMaxDiff(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33});
        perevorotMass(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33});
        outThisFromMass(new String[] {"this", "apple", "banana", "this", "orange", "grape", "melon", "this", "peach",
                "cherry", "lemon", "lime", "mango", "berry", "plum"});
        System.out.println(Arrays.toString(massBezMinus(new int[]{1, 0, -3, 4, -5, 12, -9, 0, 7, 12, 32, 33})));
        System.out.println(summNumsMass(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33}));
        System.out.println(sumFirstLastAndGo(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33}));
        System.out.println(udvoenieMass(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33}));
        System.out.println(productMass(new int[] {1, 3, 4, 5, 12, 9, 7, 12, 32, 33},
                new int[] {12, 5, 2, 1, 17, 4, 9, 11, 12, 1}));
    }

    private static boolean containsZero(int[] numbers) {
        final long timeStart = System.currentTimeMillis();
        int zeroCount = 0;
        if (numbers.length == 0) {
            System.out.println("Empty Array!");
        } else {
            for (int number : numbers) {
                if (number == 0) {
                    zeroCount++;
                    break;
                }
            }
        }
        long timeEnd = System.currentTimeMillis();
        System.out.println("Duration: " + (timeEnd - timeStart));
        return zeroCount > 0;
    }

    private static int min(int[] minMas) {
        int min;
        if (minMas.length == 0) {
            System.out.println("Массив пуст!");
            min = 0;
        } else {
            min = minMas[0];
            for (int i = 0; i < minMas.length; i++) {
                if (minMas[i] < min) {
                    min = minMas[i];
                }
            }
        }
        return min;
    }

    //задание

    private static void outNumKratThree(int size) {
        ArrayList arrayList = new ArrayList();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 3 == 0) {
                arrayList.add(array[j]);
            }
        }
        System.out.println(arrayList);
    }

    private static void numsKratChis(int size, int num) {
        ArrayList arrayList = new ArrayList();

        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            array[i] = i + 1;
        }
        for (int j = 0; j < array.length; j++) {
            if (array[j] % num == 0) {
                arrayList.add(array[j]);
            }
        }
        System.out.println(arrayList);
    }

    private static void posledFibNum(int size) {
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            if (i == 0 || i == 1 || i == 2) {
                array[0] = 0;
                array[1] = 1;
                array[2] = 1;
            } else {
                array[i] = array[i - 1] + (array[i - 2]);
            }
        }
        System.out.println(Arrays.toString(array));
    }

    private static void minMaxDiff(int[] mass) {
        int min = mass[0];
        int max = mass[0];

        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < min) {
                min = mass[i];
            } else if (mass[i] > max) {
                max = mass[i];
            }
        }
        int diff = max - min;
        System.out.println(diff);
    }

    private static void perevorotMass(int[] mass) {
        ArrayList arrayList = new ArrayList();

        for (int i = mass.length - 1; i > -1; i--) {
            arrayList.add(mass[i]);
        }
        System.out.println(arrayList);
    }

    private static void outThisFromMass(String[] mass) {
        ArrayList arrayList = new ArrayList();

        for (String s : mass) {
            if (s.equals("this")) {
                arrayList.add(s);
            }
        }
        System.out.println(arrayList);
    }

    private static int[] massBezMinus(int[] mass) {
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] < 0) {
                mass[i] = mass[i] * -1;
            }
        }
        return mass;
    }

    private static ArrayList summNumsMass(int[] mass) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mass.length; i++) {
            if (i == mass.length - 1) {
                arrayList.add(mass[i]);
            } else {
                arrayList.add(mass[i] + mass[i + 1]);
            }
        }
        return arrayList;
    }

    private static ArrayList sumFirstLastAndGo(int[] mass) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mass.length / 2; i++) {
            arrayList.add(mass[i] + mass[mass.length - 1 - i]);
        }
        return arrayList;
    }

    private static ArrayList udvoenieMass(int[] mass) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < mass.length; i++) {
            arrayList.add(mass[i]);
            arrayList.add(mass[i]);
        }
        return arrayList;
    }

//    private static ArrayList filtrMass(int[] mass) {
//        ArrayList arrayList = new ArrayList();
//        arrayList.add(mass[0]);
//        for (int i = 1; i < mass.length; i++) {
//            if (arrayList.getLast() == mass[i]) {
//
//            }
//            arrayList.add(mass[i]);
//            arrayList.add(mass[i]);
//        }
//        return arrayList;
//    }

    private static ArrayList productMass (int[] massFirst, int[] massSecond) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < massFirst.length; i++) {
            arrayList.add(massFirst[i] * massSecond[i]);
        }
        return arrayList;
    }
}