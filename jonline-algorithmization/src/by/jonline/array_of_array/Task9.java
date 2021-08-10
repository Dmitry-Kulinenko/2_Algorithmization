/*
 * Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
 * столбец содержит максимальную сумму. * 
 * */

package by.jonline.array_of_array;

import java.util.Arrays;

public class Task9 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 3, 4 }, { 5, 2, 3, 4 }, { 5, 2, 3, 4 } };

		System.out.println("Задана матрица");

		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}

		int[] sum = new int[a[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < sum.length; j++) {
				sum[j] += a[i][j];
			}
		}
		int maxSumColumnNumber = 0;
		for (int i = 0; i < sum.length; i++) {
			if (sum[maxSumColumnNumber] < sum[i]) {
				maxSumColumnNumber = i;
			}
		}
		System.out.println("Сумма элементов в каждом столбце " + Arrays.toString(sum)
				+ "; Номер столбца с наибольшей суммой " + maxSumColumnNumber);
	}

}
