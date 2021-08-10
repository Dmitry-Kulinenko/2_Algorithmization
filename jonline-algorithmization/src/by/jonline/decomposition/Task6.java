/*
 * Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми
 * 
 * */

package by.jonline.decomposition;

import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arr = new int[3];

		System.out.println("Даны 3 числа");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(500);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		if (findGCD(arr, arr.length) == 1) {
			System.out.println("Числа являются взаимно простыми");
		} else {
			System.out.println("Числа не являются взаимно простыми");
		}

	}

	static int gcd(int a, int b) {
		if (a == 0)
			return b;
		return gcd(b % a, a);
	}

	static int findGCD(int arr[], int n) {
		int result = 0;
		for (int element : arr) {
			result = gcd(result, element);

			if (result == 1) {
				return 1;
			}
		}

		return result;
	}
}
