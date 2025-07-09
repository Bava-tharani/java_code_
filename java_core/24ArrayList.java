import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter the number of students: ");
        int count = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < count; i++) {
            System.out.print("Enter name " + (i + 1) + ": ");
            String name = sc.nextLine();
            names.add(name);
        }

        System.out.println("Student Names:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
