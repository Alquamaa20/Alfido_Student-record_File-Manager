import java.io.*;
import java.util.Scanner;

public class StudentFileManager {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int choice;

        do {

            System.out.println("\n===== STUDENT RECORD FILE MANAGER =====");
            System.out.println("1. Add Student");
            System.out.println("2. Read Students");
            System.out.println("3. Exit");

            System.out.print("Enter Choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {

                case 1:

                    System.out.print("Enter Student Name: ");
                    String name = sc.nextLine();

                    try {

                        FileWriter writer = new FileWriter("students.txt", true);

                        writer.write(name + "\n");

                        writer.close();

                        System.out.println("Student Saved Successfully!");

                    } catch(IOException e) {

                        System.out.println("Error: " + e.getMessage());

                    }

                    break;

                case 2:

                    try {

                        FileReader reader = new FileReader("students.txt");

                        int ch;

                        System.out.println("\nStored Students:");

                        while((ch = reader.read()) != -1) {

                            System.out.print((char) ch);

                        }

                        reader.close();

                    } catch(IOException e) {

                        System.out.println("Error: " + e.getMessage());

                    }

                    break;

                case 3:

                    System.out.println("Program Closed!");
                    break;

                default:

                    System.out.println("Invalid Choice!");

            }

        } while(choice != 3);

        sc.close();
    }
}
