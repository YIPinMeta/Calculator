package day3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// +,-,*, and /

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter first number");
		double num1 = scanner.nextDouble();
		// System.out.println(num1);
		// 1:15:00
		System.out.println("Enter the Second number");
		double num2 = scanner.nextDouble();

		System.out.println("Choose an Operation");
		System.out.println("1. Addition");
		System.out.println("2. Subtraction");
		System.out.println("3.Multiplication");
		System.out.println("4. Division");

		int choice = scanner.nextInt();
		if (choice == 1) {
			System.out.println("Result:" + (num1 + num2));
		} else if (choice == 2)
			System.out.println("Result:" + (num1 - num2));
		else if (choice == 3)
			System.out.println("Result:" + (num1 * num2));
		else if (choice == 4) {
			if (num2 != 0) {
				System.out.println("Result:" + (num1 / num2));
			} else {
				System.out.println("Error: Division by 0 is not allowed");
			}
		} else {
			System.out.println("Invalid Input");
		}
	}

}
