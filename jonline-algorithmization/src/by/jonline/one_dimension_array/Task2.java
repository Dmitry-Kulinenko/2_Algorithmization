/*
 * Дана последовательность действительных чисел а1 ,а2 ,..., аn. 
 * Заменить все ее члены, большие данного Z, этим числом. Подсчитать количество замен.
 */
package by.jonline.one_dimension_array;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] a = { 5, 6, 4, 1, 7, 6, 9, 3, 5, 7, 2, 3, 21, 42, 36, 54, 15, 35 };
		System.out.println("Дан массив");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Введите Z");
		int z = input.nextInt();

		System.out.println("Полученный массив");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] > z) {
				a[i] = z;
				count++;
			}
			System.out.print(a[i] + " ");

		}
		System.out.println();
		System.out.println("Число замен = " + count);
	}
}
