import java.util.Scanner;

public class name_Input_Output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("The Last Name Input: ");
        String a = sc.nextLine();
        System.out.print("The Middle Name Input: ");
        String b = sc.nextLine();
        System.out.print("The First Name Input: ");
        String c = sc.nextLine();
        printName(a,b,c);
    }
    public static void printName(String lastName, String middleName, String firstName){
        System.out.print("Your full name is: "+lastName +" "+middleName +" "+firstName);
    }
}
