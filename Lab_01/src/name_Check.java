import java.util.ArrayList;
import java.util.Scanner;

public class name_Check {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of members in the list: ");
        int n = sc.nextInt();
        String arr[] = new String[n];
        sc.nextLine();
        System.out.println("Enter the full names of all members in the list: ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLine();
        }
        System.out.print("Enter the full name of the person you want to check: ");
        String name = sc.nextLine();
        nameCheck(n, arr, name);
    }
    static public void nameCheck(int n, String arr[], String name) {
        boolean check = false;
        for (int i = 0; i < n; i++) {
            if(arr[i].equals(name)){
                check = true;
                break;
            }
        }
        if(check)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
