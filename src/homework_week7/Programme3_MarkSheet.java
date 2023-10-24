package homework_week7;

import java.util.Scanner;

public class Programme3_MarkSheet {
    public static void main(String[] args) {
        //*
        /* request user to input student name
        /* request user to input Roll no.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Roll No: ");
        int rollNo = scanner.nextInt();

        /* request user to enter three subjects Maths, Science and English marks where marks are between 0 and 100
        and if it's out of range print error message "Invalid inuput, Marks should be between 0 and 100")
         */
        int maths, science, english;
        do {
            System.out.print("Enter Maths marks (0-100): ");
            maths = scanner.nextInt();
            if (maths < 0 || maths > 100) {
                System.out.println("Invalid Input, Marks should be between 0 to 100(you are not Sankuntaladevi!)");
            }
        } while (maths < 0 || maths > 100);
        do {
                System.out.println("Enter Science Marks (0-100): ");
                science = scanner.nextInt();
                if (science < 0 || science > 100) {
                    System.out.print("Invalid Input, Marks should be between 0 to 100, you are not Einstein!");
                }
            } while (science < 0 || science > 100);
            do {
                System.out.print("Enter English marks (0-100): ");
                english = scanner.nextInt();
                if (english < 0 || english > 100) {
                    System.out.println("Invalid Input, Marks should be between 0 to 100, you are not Shakespeare!");
                }
            }while (english < 0 || english > 100);
                    int total = maths + science + english;
                    double percentage = (total / 300.0) * 100;
                    String result = (percentage >= 35) ? "Pass" : "Fail";
                    //* if student is pass or fail on basis of percentage (pass>=35) and*//
                    //* also give them grade if %>=80 A+, %>= 60 a, %>= 50 B, %>=35 C *//
                    String grade;
                    if (percentage >= 80) {
                        grade = "A+";
                    } else if (percentage >= 60) {
                        grade = "A";
                    } else if (percentage >= 50) {
                        grade = "B";
                    } else if (percentage >= 35) {
                        grade = "C";
                    } else {
                        grade = "D";
                    }
                    //* Print marksheet in following format*//

                    System.out.println("___________________________________");
                    System.out.println("|                                  |");
                    System.out.println("|             Mark Sheet           |");
                    System.out.println("|__________________________________|");
                    System.out.println("| Name : " + name + "                    |");
                    System.out.println("| Roll No: " + rollNo + "                   |");
                    System.out.println("|__________________________________|");
                    System.out.println("| Subjects : Marks                 |");
                    System.out.println("|__________________________________|");
                    System.out.println("| Maths : " + maths + "                       |");
                    System.out.println("| Science : " + science + "                     |");
                    System.out.println("| English : " + english + "                     |");
                    System.out.println("|__________________________________|");
                    System.out.println("| Total : " + total + "                      |");
                    System.out.println("|__________________________________|");
                    System.out.println("| Percentage : " + percentage + "                |");
                    System.out.println("| Result : " + result + "                    |");
                    System.out.println("| Grade : " + grade + "                       |");
                    System.out.println("|__________________________________|");

                    scanner.close();
                }
            }