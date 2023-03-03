package fourthlesson;

import java.util.Scanner;

public class ClassworkTwo {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Введіть ціле число:");

		int n = scan.nextInt();

		for (int i = 0; i <= n; i++) {
			for (int j = 0; j <= n; j++) {
				if (j <= n - i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}