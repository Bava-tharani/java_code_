import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float p = sc.nextFloat();
        float r = sc.nextFloat();
        float t = sc.nextFloat();
        float si = (p * r * t) / 100;
        System.out.println("Simple Interest = " + si);
        sc.close();
    }
}
