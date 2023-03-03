package fourthlesson;

import java.util.Scanner;

public class TaskThree {

	public static void main(String[] args) {
		int height;
		int width;

		Scanner scan = new Scanner(System.in);
		System.out.println("Введіть висоту прямокутника:");
		height = scan.nextInt();
		System.out.println("Введіть ширину прямокутника:");
		width = scan.nextInt();

		for (int i = 1; i <= height; i++) {
			for (int j = 1; j <= width; j++) {
				if (i == 1 || i == height) {
					System.out.print("*");
				} else {
					if (j == 1 || j == width) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
}