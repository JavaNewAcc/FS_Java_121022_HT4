package fourthlesson;

import java.util.Scanner;

public class AddTaskTwo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int maxWidth = 0;
		boolean correctMaxWidth = false;

		while (!correctMaxWidth) {
			System.out.println("Введіть максмальну ширину пісочного годинника:");
			maxWidth = scan.nextInt();
			if (maxWidth % 2 == 0 || maxWidth <= 0) {
				System.out.println("Ширина пісочного годинника має бути позитивним непарним числом");
			} else {
				correctMaxWidth = true;
			}
		}

		for (int i = 0; i < maxWidth; i++) {
			for (int j = 0; j < maxWidth; j++) {
				if (i <= maxWidth / 2) {
					if (j < i || j >= maxWidth - i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
				if (i > maxWidth / 2) {
					if (j < maxWidth - i - 1 || j > i) {
						System.out.print(" ");
					} else {
						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
	}
}
