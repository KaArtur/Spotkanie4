package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListTester {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(123);
        numbers.add(4);

        System.out.println(numbers);
        System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        numbers.remove(0);
        System.out.println(numbers);
        System.out.println(numbers.size());
        numbers.remove((Integer) 1);
        System.out.println(numbers.size());

        numbers.clear();
        System.out.println(numbers.size());

        List<String> names = new ArrayList<>();
        names.add("Ania");
        names.add("Staszek");
        names.add("Kasia");
        names.add("Wiola");
        names.add("Marta");

        System.out.println(names);
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }
        names.remove("Staszek");
        System.out.println("---");
        for (int i = 0; i < names.size(); i++) {
            System.out.println(i + " - " + names.get(i));
        }

        System.out.println("---");
        List list = new ArrayList<>();
        list.add(1);
        list.add("siedem");
        list.add(new Object());

        System.out.println(list);



    }
}
