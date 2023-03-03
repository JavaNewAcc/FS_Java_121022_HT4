package fourthlesson;

import java.util.Scanner;

public class AddTaskThree {

	public static void main(String[] args) {
		double num;
		double err;
		double numTemp;
		double root;
		double d;

		Scanner scan = new Scanner(System.in);

		System.out
				.println("Введіть число для знаходження його дійсного кореня за допомогою ітераційної формули Герона:");
		num = scan.nextInt();
		numTemp = num;
		System.out.println("Введіть точність, з якою треба розрахувати корінь (у форматі Х,ХХ):");
		err = scan.nextDouble();

		for (;;) {
			root = (numTemp + num / numTemp) / 2;
			d = Math.abs(numTemp - root);
			if (d > err * 2 || Math.pow(d, 2) > err * 2) {
				numTemp = d;
				continue;
			} else {
				break;
			}
		}
		System.out.println("Корінь дорівнює: " + root);
	}
}
