package hash;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		StudentDirectory sd = new StudentDirectory();
		int choice;
		try {
			while (true) {
				System.out.println("Choose an option");
				System.out.println("[1] Add Student");
				System.out.println("[2] Search Student");
				System.out.println("[3] Delete Student");
				System.out.println("[4] Display Student/s");
				System.out.println("[5] Exit");
				System.out.print("Enter option: ");

				choice = sc.nextInt();

				switch (choice) {
				case 1:
					sd.addStudent();
					break;

				case 2:
					sd.searchStudent();
					break;

				case 3:
					sd.deleteStudent();
					break;

				case 4:
					sd.displayStudent();
					break;

				case 5:
					System.out.println("Thank you for using Student Directory System!");
					System.exit(0);
					break;

				default:
					System.out.println("Invalid Input! Enter 1-5 only!");
				}
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input! Enter 1-5 only!");
			main(args);
		}

	}
}
