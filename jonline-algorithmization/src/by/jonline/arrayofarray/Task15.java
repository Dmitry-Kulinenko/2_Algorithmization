/*
 * Найдите наибольший элемент матрицы и заменить все нечетные элементы на него
 * 
 * */

package by.jonline.arrayofarray;

import java.util.Random;

public class Task15 {

	public static void main(String[] args) {

		int[][] a = new int[5][10];
		int max = a[0][0];

		Random rand = new Random();

		System.out.println("Задана матрица");

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
				if (a[i][j] > max) {
					max = a[i][j];
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.printf("Наибольший элемент матрицы %d%nРезультат замены нечётных элементов:%n", max);

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {

				if ((a[i][j] & 1) == 1) {
					a[i][j] = max;
				}
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
