
/*
 * Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task10 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите число N");
		int n = input.nextInt();
		System.out.println("Число состоит из следующих цифр:");

		for (int element : parse(n)) {
			System.out.println(element);
		}
	}

	static int[] parse(int n) {
		int[] array = new int[numberLength(n)];
		int i = 0;

		while (n > 0) {
			array[i++] = n % 10;
			n = n / 10;
		}
		return array;
	}

	static int numberLength(int number) {
		int i = 0;

		do {
			i++;
			number -= (int) (number % Math.pow(10, i));
		} while (number > 1);

		return i;
	}

}
