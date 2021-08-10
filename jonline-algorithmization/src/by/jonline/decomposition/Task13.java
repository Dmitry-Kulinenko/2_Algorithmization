/*
 * Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
 * Найти и напечатать все пары «близнецов» из отрезка [n,2n], где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите начало отрезка n");
		int n = input.nextInt();
		System.out.println("Все близнецы на этом отрезке:");
		getTwins(n);
	}

	static void getTwins(int n) {
		int end = n * 2;
		while (n + 2 <= end) {

			System.out.println(n + " " + (n + 2));
			n++;

		}
	}
}
