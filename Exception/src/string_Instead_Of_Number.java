public class string_Instead_Of_Number {
    public static void main(String[] args) {
        String input1 = "khương duy";
        String input2 = "123";

        try {
            int number = Integer.valueOf(input1);
            System.out.println("The number is: "+number);
        }
        catch (NumberFormatException ex) {
            System.out.println("Error: Please enter a valid number.");
            ex.printStackTrace();
        }
        finally {
            int number = Integer.valueOf(input2);
            System.out.println("The number is: "+number);
        }

    }
}
