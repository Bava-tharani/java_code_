import java.util.*;

public class LambdaSort {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Meena");
        names.add("Arjun");
        names.add("Kavya");
        names.add("Bala");

        Collections.sort(names, (a, b) -> a.compareTo(b));

        System.out.println("Sorted names:");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
