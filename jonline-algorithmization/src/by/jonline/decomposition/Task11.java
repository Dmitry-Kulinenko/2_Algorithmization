/*
 * Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task11 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите число A");
		int a = input.nextInt();

		System.out.println("Введите число B");
		int b = input.nextInt();

		if (numberLength(a) > numberLength(b)) {
			System.out.println("В числе A больше цифр");
		} else {
			System.out.println("В числе B больше цифр");
		}

	}

	static int numberLength(int number) {
		int i = 0;

		do {
			i++;
			number -= (int) (number % Math.pow(10, i));
		} while (number > 0);

		return i;
	}
}
