public class division_By_Zero {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            int c = a / b;
            System.out.println("c = " + c);
        }
        catch (ArithmeticException ex) {
            System.out.println("Error: Division by zero is not allowed.");
            ex.printStackTrace();
        }
        finally {
            int c = a * b;
            System.out.println("c = "+c);
        }

    }
}
