/*
 * Даны натуральные числа К и N. Написать метод(методы) формирования массива А, 
 * элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task12 {
	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите K");
		int k = input.nextInt();

		System.out.println("Введите N");
		int n = input.nextInt();
		getSum(3453);
		int[] array = makeArray(n, k);

		for (int i : array) {
			if (i > 0) {
				System.out.print(i + " ");
			}

		}
	}

	static int[] makeArray(int n, int k) {
		int[] array = new int[n / 4];
		int i = 0;
		while (n > 0) {
			if (getSum(n) == k) {
				array[i++] = n;
			}
			n--;
		}
		return array;
	}

	static int getSum(int element) {

		int n = element;
		int sum = 0;

		while (n / 10 > 0) {
			sum += n % 10;
			n = (n - n % 10) / 10;
		}

		if (n / 10 < 10) {
			sum += n;
		}
		return sum;
	}
}
