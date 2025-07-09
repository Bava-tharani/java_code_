public class OperatorPrecedenceDemo {
    public static void main(String[] args) {
        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 20 - 10 + 5;
        int result4 = 100 / 10 + 2;
        int result5 = 17 % 3 + 4 * 2;

        System.out.println("Result 1 (10 + 5 * 2): " + result1);
        System.out.println("Result 2 ((10 + 5) * 2): " + result2);
        System.out.println("Result 3 (20 - 10 + 5): " + result3);
        System.out.println("Result 4 (100 / 10 + 2): " + result4);
        System.out.println("Result 5 (17 % 3 + 4 * 2): " + result5);
    }
}
