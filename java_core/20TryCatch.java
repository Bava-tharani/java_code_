import java.util.Scanner;

public class DivisionWithTryCatch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter numerator: ");
        int num1 = sc.nextInt();

        System.out.print("Enter denominator: ");
        int num2 = sc.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }

        sc.close();
    }
}
