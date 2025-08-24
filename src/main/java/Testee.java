public class Testee {

    public static void main(String[] args) {
        int divident = 10;
        int divisor = 0;
        try {
            int result = divident / divisor;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException: " + e.getMessage());
        }
        System.out.println("durchgelofen");
    }
}
