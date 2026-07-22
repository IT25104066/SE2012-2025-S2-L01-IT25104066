import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int marks[][] = new int[n][3];

        System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\n5:Exit\n");
        int choice = sc.nextInt();
        while (choice<1 || choice>5) {
            System.out.print("Invalid choice, enter again: ");
            choice = sc.nextInt();
        }

        while (true) {
            if (choice == 1) {
                for (int i=0; i<n; i++) {
                    System.out.println("Adding Mathematics marks:");
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][0] =  inputMark;
                }
                for (int i=0; i<n; i++) {
                    System.out.println("Adding Chemistry marks:");
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][1] =  inputMark;
                }
                for (int i=0; i<n; i++) {
                    System.out.println("Adding Physics marks:");
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][2] =  inputMark;
                }
            } else if (choice == 2) {
                System.out.print("Enter student id to get the student average: ");
                int stdId = sc.nextInt();
                float stdAvg = (marks[stdId-1][0] + marks[stdId-1][1] + marks[stdId-1][2]) / 3;
                System.out.printf("The average of student with student ID %d: %.1f\n", stdId, stdAvg);
            } else if (choice == 3) {
                System.out.println()
            }
            System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\n5:Exit\n");
            choice = sc.nextInt();
            while (choice<1 || choice>5) {
                System.out.print("Invalid choice, enter again: ");
                choice = sc.nextInt();
            }
        }
    }
}