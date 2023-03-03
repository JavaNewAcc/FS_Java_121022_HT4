package fourthlesson;

import java.util.Scanner;

public class AddTaskOne {

	public static void main(String[] args) {
		boolean correctHeight = false;
		int height = 0;
		Scanner scan = new Scanner(System.in);

		while (!correctHeight) {
			System.out.println("Введіть висоту трикутника");
			height = scan.nextInt();
			if (height > 0) {
				correctHeight = true;
			} else {
				System.out.println("Висота трикутника має бути більше 0");
			}
		}

		int heightTemp = height + 1;

		for (int i = 1; i <= heightTemp * (height * 2 - 1); i++) {
			if (i % heightTemp == 0) {
				System.out.println();
			} else {
				if (i <= (height * heightTemp)) {
					if ((i / heightTemp + 1) >= (i % heightTemp)) {
						System.out.print("*");
					} else {
						System.out.print("");
					}
				} else {
					if ((i / heightTemp + i % heightTemp) <= (height * 2 - 1)) {
						System.out.print("*");
					} else {
						System.out.print("");
					}
				}
			}
		}
	}
}