import java.util.Scanner;

public class MarksNew{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = Integer.parseInt(sc.nextLine());
        int marks[][] = new int[n][3];

        System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\ngrades:Display grade\n5:Update marks\n6:Exit\n");
        String choice = sc.nextLine();
        while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("grades") && !choice.equals("5") && !choice.equals("6")) {
            System.out.print("Invalid choice, enter again: ");
            choice = sc.nextLine();
        }

        while (true) {
            if (choice.equals("1")) {
                System.out.println("Adding Mathematics marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = Integer.parseInt(sc.nextLine());
                    marks[i][0] =  inputMark;
                }
                System.out.println("Adding Chemistry marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = Integer.parseInt(sc.nextLine());
                    marks[i][1] =  inputMark;
                }
                System.out.println("Adding Physics marks:");
                for (int i=0; i<n; i++) {
                    System.out.printf("Student %d: ", i+1);
                    int inputMark = Integer.parseInt(sc.nextLine());
                    marks[i][2] =  inputMark;
                }
            } else if (choice.equals("2")) {
                System.out.print("Enter student id to get the student average: ");
                int stdId = Integer.parseInt(sc.nextLine());
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = Integer.parseInt(sc.nextLine());
                }
                float stdAvg = (marks[stdId-1][0] + marks[stdId-1][1] + marks[stdId-1][2]) / 3;
                System.out.printf("The average of student with student ID %d: %.1f\n", stdId, stdAvg);
            } else if (choice.equals("3")) {
                System.out.println("Enter subject id to get the subject average:\n1:Mathematics\n2:Chemistry\n3:Physics");
                int subID = Integer.parseInt(sc.nextLine());
                while (subID<1 || subID>3) {
                    System.out.print("Invalid choice, enter again: ");
                    subID = Integer.parseInt(sc.nextLine());
                }
                float subAvg = 0;
                int subTotal = 0;
                for (int i=0; i<n; i++) {
                    subTotal = subTotal + marks[i][subID-1];
                }
                subAvg = subTotal / n;
                System.out.printf("Average of this subject: %.1f\n", subAvg);

            } else if (choice.equals("4")) {
                System.out.print("Enter student id to get the total mark of student: ");
                int stdId = Integer.parseInt(sc.nextLine());
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = Integer.parseInt(sc.nextLine());
                }
                int totalMark = marks[stdId-1][0] + marks[stdId-1][1] + marks[stdId-1][2];
                System.out.printf("The total mark of student with student ID %d: %d\n", stdId, totalMark);
            } else if (choice.equals("grades")) {
                String grade = "";
                int stdMark = 0;
                System.out.println("Student grades:");

                System.out.println("Student ID\tMathematics\tChemistry\tPhysics");
                for (int i=0; i<n; i++) {
                    System.out.printf("%d\t\t", i+1);
                    for (int j=0; j<3; j++) {
                        stdMark = marks[i][j];
                        if (stdMark >= 90) {
                            grade = "Grade A";
                        } else if (stdMark >= 80) {
                            grade = "Grade B";
                        } else if (stdMark >= 70) {
                            grade = "Grade C";
                        } else if (stdMark >= 60) {
                            grade = "Grade D";
                        } else {
                            grade = "Fail";
                        }
                        System.out.printf("%s\t\t", grade);
                    }
                    System.out.println();
                }
            } else if (choice.equals("5")) {
                System.out.print("Enter student id to update the marks: ");
                int stdId = Integer.parseInt(sc.nextLine());
                while (stdId<1 || stdId>n) {
                    System.out.print("Invalid choice, enter again: ");
                    stdId = Integer.parseInt(sc.nextLine());
                }
                System.out.println("Enter the subject id to update the marks:\n1:Mathematics\n2:Chemistry\n3:Physics");
                int subID = Integer.parseInt(sc.nextLine());
                while (subID<1 || subID>3) {
                    System.out.print("Invalid choice, enter again: ");
                    subID = Integer.parseInt(sc.nextLine());
                }
                System.out.printf("Enter the new mark for student %d in subject id  %d: ", stdId, subID);
                int inputMark = Integer.parseInt(sc.nextLine());
                marks[stdId-1][subID-1] = inputMark;
                System.out.println("Mark updated successfully.");
            } else if (choice.equals("6")) {
                System.out.println("Exiting...");
                break;
            }

            System.out.print("Enter:\n1:Add marks\n2:Get student average\n3:Get subject average\n4:Get total mark of student\ngrades: Display grades\n5:Update marks\n6:Exit\n");
            choice = sc.nextLine();
            while (!choice.equals("1") && !choice.equals("2") && !choice.equals("3") && !choice.equals("4") && !choice.equals("grades") && !choice.equals("5") && !choice.equals("6")) {
                System.out.print("Invalid choice, enter again: ");
                choice = sc.nextLine();
            }
        }
    }
}
