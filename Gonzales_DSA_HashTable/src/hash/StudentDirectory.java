package hash;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentDirectory {
	HashMap <String, Student> students;
	Scanner sc;

	public StudentDirectory() {
		students = new HashMap<>();
		sc = new Scanner(System.in);
	}

	public void addStudent() {
		System.out.print("Enter student's name: ");
		String name = sc.nextLine();

		System.out.print("Enter student's ID number: ");
		String id = sc.nextLine();

		System.out.print("Enter student's major: ");
		String major = sc.nextLine();

		Student newStudent = new Student(name, id, major);
		students.put(id, newStudent);

		System.out.println("Student added successfully!\n");
	}

	public void searchStudent() {
		System.out.print("Enter student ID number to search: ");
		String id = sc.nextLine();

		if (students.containsKey(id)) {
			Student foundStudent = students.get(id);
			System.out.print(foundStudent + " found!\n\n");
		} else {
			System.out.println("Student not found.\n");
		}
	}

	public void deleteStudent() {
		System.out.print("Enter student ID number to delete: ");
		String id = sc.nextLine();

		if (students.containsKey(id)) {
			students.remove(id);
			System.out.println("Student deleted successfully!\n");
		} else {
			System.out.println("Student not found.\n");
		}
	}

	public void displayStudent() {
		System.out.println("-----------------------------------------------------------------");
		System.out.printf("| %-20s | %-20s | %-15s |\n", "Name", "ID", "Major");
		System.out.println("-----------------------------------------------------------------");

		for (Map.Entry<String, Student> entry : students.entrySet()) {
			Student student = entry.getValue();
			System.out.printf("| %-20s | %-20s | %-15s |\n", student.getName(), student.getId(), student.getMajor());
		}
		System.out.println("-----------------------------------------------------------------\n");
	}
}
