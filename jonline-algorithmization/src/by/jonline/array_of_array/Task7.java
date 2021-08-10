/*
 * Сформировать квадратную матрицу порядка N по правилу:
 * 
 * */

package by.jonline.array_of_array;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Task7 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите порядок квадратной матрицы n");
		int n = input.nextInt();

		double[][] a = new double[n][n];
		int numberOfPositiveElements = 0;
		DecimalFormat df = new DecimalFormat("#0.000");

		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				a[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2)) / 10);
				if (a[i][j] >= 0) {
					numberOfPositiveElements++;
				}
				System.out.printf(df.format(a[i][j]) + "\t");
			}
		}
		System.out.println();
		System.out.println("Колличество положительных элементов " + numberOfPositiveElements);

	}

}
