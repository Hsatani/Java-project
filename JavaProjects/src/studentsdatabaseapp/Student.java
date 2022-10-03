package studentsdatabaseapp;

import java.util.Scanner;

public class Student {

	private String firstName;
	private String lastName;
	private String gradeYear;
	private String studentID;
	private String courses = null;
	private int tuitionBalance = 0;
	private static int costOfCourse = 300;
	private static int id = 1000;
	
	// Constructor: prompt user to enter student's name and year
	public Student() {
		Scanner in = new Scanner(System.in);
		System.out.print("Enter student first name: ");
		this.firstName = in.nextLine();
		
		
		
		System.out.print("Enter student last name: ");
		this.lastName = in.nextLine();
		
		System.out.print("1- freshmen\n2 - Sophomore\n3 - Junior\n4 - Senior\nEnter student class level: ");
		this.gradeYear = in.nextLine();
		setStudentId();
		System.out.println(firstName + " " + lastName + " " + gradeYear + studentID );
	}
	
	
	// Generate an ID
	private void setStudentId() {
		id++;
		this.studentID = gradeYear + " " + id;
		
	}
	
	// Enroll in courses

	public void enroll() {
		do {
		System.out.println("Enter course to enroll (Q to quit): ");
		Scanner in = new Scanner(System.in);
		String course = in.nextLine();
		if (!course.equals("Q")) {
			courses = courses + "\n" + course;
			tuitionBalance = tuitionBalance + costOfCourse;
		}
		
		else {
			System.out.println("Break!");
			break;
		}
	} while (1 != 0);
		System.out.println("ENROLLED IN: "+ courses);
		//System.out.println("TUITION BALANCEE: " + tuitionBalance);
	}
	
	// view Balance 
	public void viewBalance() {
		System.out.println("Your balance is: $" + tuitionBalance);
	}
	// Pay Tuition
	public void payTuition() {
		viewBalance();
		System.out.println("Enter your payment: ");
		Scanner in = new Scanner(System.in);
		int payment = in.nextInt();
		tuitionBalance = tuitionBalance - payment;
		System.out.println("Thank you for your payment of $" + payment);
		viewBalance();
		
	}
	
	// Show status
}
