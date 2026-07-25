import java.util.Scanner;

public class Marks{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = sc.nextInt();
        int marks[][] = new int[n][3];

        System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\n5:Update marks\n6:Exit\n");
        int choice = sc.nextInt();
        while (choice<1 || choice>6) {
            System.out.print("Invalid choice, enter again: ");
            choice = sc.nextInt();
        }

        while (true) {
            if (choice == 1) {
                System.out.println("Adding Mathematics marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][0] =  inputMark;
                }
                System.out.println("Adding Chemistry marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][1] =  inputMark;
                }
                System.out.println("Adding Physics marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = sc.nextInt();
                    marks[i][2] =  inputMark;
                }
            } else if (choice == 2) {
                System.out.print("Enter student id to get the student average: ");
                int stdId = sc.nextInt();
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = sc.nextInt();
                }
                float stdAvg = (marks[stdId-1][0] + marks[stdId-1][1] + marks[stdId-1][2]) / 3;
                System.out.printf("The average of student with student ID %d: %.1f\n", stdId, stdAvg);
            } else if (choice == 3) {
                System.out.println("Enter subject id to get the subject average:\n1:Mathematics\n2:Chemistry\n3:Physics");
                int subID = sc.nextInt();
                while (subID<1 || subID>3) {
                    System.out.print("Invalid choice, enter again: ");
                    subID = sc.nextInt();
                }
                float subAvg = 0;
                int subTotal = 0;
                for (int i=0; i<n; i++) {
                    subTotal = subTotal + marks[i][subID-1];
                }
                subAvg = subTotal / n;
                System.out.printf("Average of this subject: %.1f\n", subAvg);

            } else if (choice == 4) {
                System.out.print("Enter student id to get the total mark of student: ");
                int stdId = sc.nextInt();
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = sc.nextInt();
                }
                int totalMark = marks[stdId-1][0] + marks[stdId-1][1] + marks[stdId-1][2];
                System.out.printf("The total mark of student with student ID %d: %d\n", stdId, totalMark);
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            } else if (choice ==5) {
                System.out.print("Enter student id to update the marks: ");
                int stdId = sc.nextInt();
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = sc.nextInt();
                }
                System.out.println("Enter the subject id to update the marks:\n1:Mathematics\n2:Chemistry\n3:Physics");
                int subID = sc.nextInt();
                while (subID<1 || subID>3) {
                    System.out.print("Invalid choice, enter again: ");
                    subID = sc.nextInt();
                }
                System.out.printf("Enter the new mark for student %d in subject id  %d: ", stdId, subID);
                int inputMark = sc.nextInt();
                marks[stdId-1][subID-1] = inputMark;
                System.out.println("Mark updated successfully.");
            } else if (choice == 6) {
                System.out.println("Exiting...");
                break;
            }
            System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\n5:Update marks\n6:Exit\n");
            choice = sc.nextInt();
            while (choice<1 || choice>6) {
                System.out.print("Invalid choice, enter again: ");
                choice = sc.nextInt();
            }
        }
    }
}
