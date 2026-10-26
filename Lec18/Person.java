package Lec18;

public class Person {
    String first_name;
    String last_name;
    int age;

    public Person(String first_name, String last_name, int age) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.age = age;
        System.out.println("Имя: " + first_name + ", фамилия: " + last_name + ", возраст: " + age);
    }
}
