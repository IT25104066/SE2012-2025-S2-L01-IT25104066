import java.util.Scanner;

public class Welcome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter you first name: ");
        String firstName = sc.nextLine();
        System.out.print("Enter you last name: ");
        String lastName = sc.nextLine();
        System.out.printf("Welcome to the second year %s %s\n",firstName, lastName);

    }
}