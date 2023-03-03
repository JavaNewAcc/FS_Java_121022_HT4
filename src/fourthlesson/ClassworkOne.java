package fourthlesson;

import java.util.Scanner;

public class ClassworkOne {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int start;
		int end;

		System.out.println("Введіть перше число:");
		start = scan.nextInt();
		System.out.println("Введіть друге число:");
		end = scan.nextInt();

		int sum = 0;

		if (start > end) {
			for (int i = end; i <= start; i++) {
				sum += i;
			}
		} else {
			for (int i = start; i <= end; i++) {
				sum += i;
			}
		}
		System.out.println("Сумма чисел: " + sum);
	}
}