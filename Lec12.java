public class Lec12 {

    private static int count = 0;
    private static int playerNumber = 1;
    private static int playerNumber1StepsCoutn = 0;

    public static void main(String[] args) {



    }

//    private static int max(int a, int b) {
//        return a > b ? a : b;
//    }
//
//    private static int max(int a, int b, int c) {
//        return a > b && a > c ? a : b > a && b > c ? b : c;
//    }
//
//    private static int kv(int a){
//        int b = a * a;
//        return b;
//    }
//
//    private static boolean isTriAngelRight(int a, int b, int c){
//        return (a > 0 && b > 0 && c > 0) && !(kv(a) * kv(b) == kv(c) || kv(a) * kv(c) == kv(b) || kv(c) * kv(b) == kv(a));
//    }
//
//    //задания
//
//    private static boolean isTriAngel(int a, int b, int c){
//        return (a > 0 && b > 0 && c > 0) && (a + b > c && b + c > a && c + a > b);
//    }
//
//    private static int isSmallest(int a, int b, int c, int d){
//        int smallest = 0;
//        if (a < b && a < c && a < d){
//            smallest = a;
//        } else if (b < a && b < c && b < d){
//            smallest = b;
//        } else if (c < b && c < a && c < d){
//            smallest = c;
//        } else if (d < b && d < c && d < a){
//            smallest = d;
//        }
//        return smallest;
//    }
//
//    private static String alarmTime(boolean isDayOff, boolean isHoliday){
//        String alarm = "";
//        if (isDayOff && isHoliday){
//            alarm = "No alarm";
//        } else if (isDayOff || isHoliday) {
//            alarm = "Alarm in 11:00";
//        } else if (!(isDayOff && isHoliday)){
//            alarm = "Alarm in 6:00";
//        }
//        return alarm;
//    }
//
//    private static String inspectTriangle(int a, int b, int c){
//        String tips = "";
//        if (a > 0 && b > 0 && c > 0) {
//            if (a == b && a == c) {
//                tips = "Равносторонний";
//            } else if (a == 90 || b == 90 || c == 90) {
//                tips = "Прямоугольный";
//            } else if (a == b || b == c || a == c) {
//                tips = "Равнобедренный";
//            } else if (a > 90 || b > 90 || c > 90) {
//                tips = "Тупоугольный";
//            } else if (a < 90 || b < 90 || c < 90) {
//                tips = "Остроугольный";
//            }
//        } else {
//            tips = "Не является треугольником";
//        }
//        return tips;
//    }
//
//    private static String isOld(int a){
//        String out = "";
//        if (a > 18 && a < 90){
//            out = "Доступ разрешён";
//        } else if (a > 1 && a <= 18 ){
//            out = "Доступ запрещён";
//        } else {
//            out = "Вы бот";
//        }
//        return out;
//    }
//
//    private static String whereGo(int a){
//        String out = "";
//        if (a < 1 || a >= 99){
//            out = "Иди куда подальше";
//        } else if (a > 4 && a < 8){
//            out = "Иди в детсад";
//        } else if (a > 7 && a < 16) {
//            out = "Иди в школу";
//        } else if (a > 15 && a < 20) {
//            out = "Иди в колледж";
//        } else if (a > 19 && a < 25) {
//            out = "Иди в универ";
//        } else if (a > 24 && a < 65) {
//            out = "Иди на работу";
//        } else if (a > 64 && a < 99) {
//            out = "Идите в поликлинику";
//        }
//        return out;
//    }
//
//    private static void isWelcome(boolean youAnton, boolean youDenis){
//        if (youAnton || youDenis){
//            System.out.println("Добро пожаловать отсюда!");
//        } else {
//            System.out.println("Добро пожаловать!");
//        }
//    }
//
//    private static void stateWater(int waterTemp){
//        if (waterTemp <= 0) {
//            System.out.println("Лёд");
//        } else if (waterTemp > 0 && waterTemp < 101) {
//            System.out.println("Вода");
//        } else {
//            System.out.println("Пар");
//        }
//    }
//
//    private static void isTraditional(boolean heGet, boolean sheGet){
//        if (heGet && sheGet){
//            System.out.println("Они получили своё");
//        } else if (!heGet && !sheGet) {
//            System.out.println("Вы уходит");
//        }
//    }
//
//    private static boolean isClear(String a, String b){
//        return !a.isEmpty() && !b.isEmpty() && a == b;
//    }
//
//
//    private static void whoIs(int a, int b, int c, int d, int e){
//        int average = (a + b + c + d + e) / 5;
//        if (average == 5){
//            System.out.println("Отличник");
//        } else if (average == 4){
//            System.out.println("Хорошист");
//        } else if (average == 3) {
//            System.out.println("Троечник");
//        } else if (average <= 2) {
//            System.out.println("Двоечник");
//        }
//    }
//
//    private static void checkName(String name, String lastName){
//        if (name.equals("Иван") && lastName.equals("Иванов")){
//            System.out.println("КОМБО!");
//        } else if (name.equals("Иван") || lastName.equals("Иванов")){
//            System.out.println("Вам отказано");
//        } else {
//            System.out.println("Здравствуйте " + name + " " + lastName);
//        }
//    }
//
//    private static int chislo(int a){
//        int ret = 0;
//        if (a > 0){
//            ret = a;
//        } else if (a < 0) {
//            ret = a * -1;
//        } else {
//            System.out.println("Это ноль");
//        }
//        return ret;
//    }
//
//    }
//
//    private static boolean LessUnlk(int numLess, boolean isUserPremium){
//        boolean bul = true;
//        if (isUserPremium) {
//            System.out.println("Урок " + numLess + " выбран");
//        } else if (isUserPremium == false && numLess == 1) {
//            System.out.println("Можете пройти только первый урок");
//        } else if (numLess > 100 || numLess < 1) {
//            bul = false;
//            System.out.println("Номер невалидный");
//        }
//        return bul;
//    }

    private static void increment() {
        if (count < 5) {
            System.out.println("Вызов метода");
            count++;
        } else {
            System.out.println("Лимит превышен");
        }
    }

    private static boolean isUrl(String a){
        return a.startsWith("https://");
    }

    private static void SquareOrRectangle(int a, int b, int c, int d){
        if (a == b && a == c && a == d && b == c && b == d && c == d) {
            System.out.println("Это квадрат");
        } else if (a == b && c == d){
            System.out.println("Это прямоугольник");
        } else {
            System.out.println("Это четырёхугольник");
        }
    }

    private static void hod(int playerNumberLocal, String hod) {
        if (playerNumberLocal == playerNumber)
            System.out.println(hod);
            playerNumber = playerNumber == 1 ? 2 : 1;
    }

    private static void doStep(int playerNumberLocal, String step) {
        if (playerNumberLocal == playerNumber) {
            if (playerNumberLocal == 1){
                if (playerNumber1StepsCoutn == 0) {
                    playerNumber1StepsCoutn++;
                    System.out.println(step);
                } else if (playerNumber1StepsCoutn == 1) {
                    playerNumber1StepsCoutn = 0;
                    System.out.println(step);
                    playerNumber = 2;
                }
            } else {
                System.out.println(step);
                playerNumber = 1;
            }
        }
    }

}