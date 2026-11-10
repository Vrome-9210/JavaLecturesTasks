import java.util.ArrayList;
import java.util.List;

public class Lec27 {

    static void main(String[] args) {
        List<String> list = new ArrayList<>();
        System.out.println(list.isEmpty());
        list.add("first");
        list.add("second");
        for (String string : list) {
            System.out.println(string);
        }

        list.remove("first");
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i +  " item " + list.get(i));
        }

        list.add(0, "third");
        list.add("fourth");
        System.out.println("added 2 items");
        list.remove(list.size() - 1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("i " + i +  " item " + list.get(i));
        }

        list.add("first");
        System.out.println(list.indexOf("first"));
        System.out.println(list.lastIndexOf("first"));

        list.sort((o1, o2) -> 0);
        System.out.println("Sorted");
        for (String string : list) {
            System.out.println(string);
        }

        System.out.println("Clear list");
        list.clear();
        list.add("new");
        list.add(null);
        for (String string : list) {
            System.out.println(string);
        }
        list.set(1, "not");
        for (String string : list) {
            System.out.println(string);
        }


    }
}
