import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        char op = input.next().charAt(0);
        double result = 0;

        if (op == '+') result = a + b;
        else if (op == '-') result = a - b;
        else if (op == '*') result = a * b;
        else if (op == '/') {
            if (b == 0) {
                System.out.println("Cannot divide by zero");
                input.close();
                return;
            }
            result = a / b;
        } else {
            System.out.println("Invalid operation");
            input.close();
            return;
        }

        System.out.println("Result = " + result);
        input.close();
    }
}
