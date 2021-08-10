/*
 * Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
 * 
 * */

package by.jonline.array_of_array;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 6, 8 }, { 1, 2, 7, 2 }, { 3, 2, 10, 7 }, { 4, 2, 3, 6 } };
		int k;
		int p;
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Дана матрица");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " " + '\t');
			}
		}
		System.out.println();
		System.out.println("Введите номер строки для вывода");

		k = input.nextInt();

		for (int i = 0; i < a.length; i++) {
			System.out.print(a[k][i] + " ");
		}
		System.out.println();

		System.out.println("Введите номер столбца для вывода");
		p = input.nextInt();

		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i][p]);
		}

	}

}
