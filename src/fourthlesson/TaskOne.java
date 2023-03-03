package fourthlesson;

import java.util.Scanner;

public class TaskOne {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		long factor = 1;
		System.out.println("Введіть число n для розрахунку факторіалу з урахуванням наступної умови 4<n<16:");
		int n = scan.nextInt();

		if (n > 4 && n < 16) {
			for (int i = 1; i <= n; i++) {
				factor = factor * i;
			}
			System.out.println(factor);
		} else {
			System.out.println("Ви ввели невірне число.");
		}
	}
}