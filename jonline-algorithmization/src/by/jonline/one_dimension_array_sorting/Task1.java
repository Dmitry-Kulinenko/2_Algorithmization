/* Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
 * один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
 * дополнительный массив.
 *  
 * */

package by.jonline.one_dimension_array_sorting;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		int[] a = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
		int[] b = new int[3];
		System.out.printf("Введите число от %1d до %2d%n", 0, a.length - 1);
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int k = input.nextInt();

		for (int i = 0; i < a.length; i++) {
			if (i == k) {
				for (int j = 0; j < b.length; j++) {
					System.out.print(b[j] + " ");

				}

			}
			System.out.print(a[i] + " ");
		}

	}
}
