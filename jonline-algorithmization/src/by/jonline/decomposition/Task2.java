/*
 * Написать метод(методы) для нахождения наибольшего общего делителя четырех
 * натуральных чисел.
 * 
 * */
package by.jonline.decomposition;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {

		int arr[] = new int[4];
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите 4 натуральных числа для нахождения их НОД");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = input.nextInt();
		}
		System.out.println("Результат вычисления: " + findGCD(arr, arr.length));
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
