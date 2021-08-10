/*
 * Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789). 
 * Для решения задачи использовать декомпозицию.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Введите порядок искомых чисел");
		int n = in.nextInt();
		getAscendingSequence(n);
	}

	static void getAscendingSequence(int n) {
		if (n > 9) {
			return;
		}
		int[] digit = new int[n];
		int i = n - 1;
		while (i < n) {
			if (digit[i] < (9 - i)) {
				digit[i]++;
				while (i > 0) {
					digit[i - 1] = digit[i] + 1;
					i--;
				}
				printNumber(digit);
			} else {
				i++;
			}
		}
		System.out.println();
	}

	static void printNumber(int[] a) {
		for (int i = a.length - 1; i >= 0; i--) {
			System.out.print(a[i]);
		}
		System.out.print(" ");
	}
}
