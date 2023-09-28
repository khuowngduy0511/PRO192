import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Please select an operation (+, -, *, /): ");
        Scanner scStr = new Scanner(System.in);
        switch(scStr.nextLine()) {
            case "+" :
                add(a, b);
                break;
            case "-" :
                sub(a, b);
                break;
            case "*" :
                mul(a, b);
                break;
            case "/" :
                div(a, b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
    public static void add(double a, double b) {
        double c = a + b;
        System.out.println("The sum of "+a +" and "+b +" is "+c);
    }

    public static void sub(double a, double b) {
        double c = a - b;
        System.out.println("The difference between "+a +" and "+b +" is "+c);
    }

    public  static  void mul(double a, double b) {
        double c = a * b;
        System.out.println("The product of "+a +" and "+b +" is "+c);
    }

    public static void div(double a, double b) {
        double c = a / b;
        if (b == 0)
            System.out.println(+a +" divided by zero is undefined");
        else
            System.out.println("The quotient of "+a +" and "+b +" is "+c);
    }
}

