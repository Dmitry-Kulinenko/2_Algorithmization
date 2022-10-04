/*
 * Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
 * 
 * */

package by.jonline.arrayofarray;

import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = input.nextInt();

		int[][] a = new int[n][n];

		for (int i = 0; i < a.length; i++) {
			if (i % 2 == 0) {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = j + 1;
				}
			} else {
				for (int j = 0; j < a.length; j++) {
					a[i][j] = n - j;
				}
			}

		}

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " ");
			}
		}
	}
}
