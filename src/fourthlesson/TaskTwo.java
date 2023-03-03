package fourthlesson;

import java.util.Scanner;

public class TaskTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть число, для якого треба вивести таблицю множення:");
		int number = scan.nextInt();
		for (int i = 1; i <= 10; i++) {
			System.out.println(number + " * " + i + " = " + (number * i));
		}
	}
}