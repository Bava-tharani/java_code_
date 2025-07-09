import java.util.*;
import java.util.stream.Collectors;

record Person(String name, int age) {}

public class RecordExample {
    public static void main(String[] args) {
        List<Person> people = List.of(
            new Person("Arjun", 22),
            new Person("Meera", 17),
            new Person("Kavi", 25)
        );

        List<Person> adults = people.stream()
                                    .filter(p -> p.age() >= 18)
                                    .collect(Collectors.toList());

        System.out.println("All people:");
        people.forEach(System.out::println);

        System.out.println("Adults:");
        adults.forEach(System.out::println);
    }
}
