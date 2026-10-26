package Lec18;

public class Lesson {
    int lessonNumber;
    boolean lessonOver;

    public Lesson(int lessonNumber, boolean lessonOver) {
        this.lessonNumber = lessonNumber;
        this.lessonOver = lessonOver;
        System.out.println("Номер урока: " + lessonNumber + ", урок завершён: " + lessonOver);
    }
}
