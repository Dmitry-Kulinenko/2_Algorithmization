/*
 * В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К 
 * 
 * */

package by.jonline.onedimensionarray;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите K");
		int k = input.nextInt();

		int sum = 0;
		int[] a = { 1, 2, 3, 4, 5, 6 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] % k == 0)
				sum += a[i];
		}
		System.out.println("Сумма кратных K = " + sum);
	}

}
