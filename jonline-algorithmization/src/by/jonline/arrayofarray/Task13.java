/*Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
 * ***/

package by.jonline.arrayofarray;

import java.util.Random;
import java.util.Scanner;

public class Task13 {

	public static void main(String[] args) {

		int[][] a = new int[5][10];
		int[] aux = new int[a.length];
		int[] aColumn = new int[a.length];

		Random rand = new Random();
		System.out.println("Задана матрица");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(10);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}

		System.out.println("Выберите тип сортировки: 1 - по возрастанию, 2 - по убыванию");

		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		switch (userChoice) {
		case 1: {
			for (int i = 0; i < a[0].length; i++) {
				for (int j = 0; j < aColumn.length; j++) {
					aColumn[j] = a[j][i];
				}

				sortAscending(aColumn, aux, 0, a.length);

				for (int j = 0; j < aColumn.length; j++) {
					a[j][i] = aColumn[j];
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}

			break;
		}
		case 2: {
			for (int i = 0; i < a[0].length; i++) {
				for (int j = 0; j < aColumn.length; j++) {
					aColumn[j] = a[j][i];
				}

				sortDescending(aColumn, aux, 0, a.length);

				for (int j = 0; j < aColumn.length; j++) {
					a[j][i] = aColumn[j];
				}
			}
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + "\t");
				}
				System.out.println();
			}

			break;
		}

		}
	}

	static void sortAscending(int[] a, int[] aux, int lo, int hi) {
		if (hi - lo <= 1)
			return;
		int mid = lo + (hi - lo) / 2;
		sortAscending(a, aux, lo, mid);
		sortAscending(a, aux, mid, hi);
		int i = lo, j = mid;

		for (int k = lo; k < hi; k++) {
			if (i == mid)
				aux[k] = a[j++];
			else if (j == hi)
				aux[k] = a[i++];
			else if (a[j] < a[i])
				aux[k] = a[j++];
			else
				aux[k] = a[i++];
		}
		for (int k = lo; k < hi; k++)
			a[k] = aux[k];

	}

	static void sortDescending(int[] a, int[] aux, int lo, int hi) {
		if (hi - lo <= 1)
			return;
		int mid = lo + (hi - lo) / 2;
		sortDescending(a, aux, lo, mid);
		sortDescending(a, aux, mid, hi);
		int i = lo, j = mid;

		for (int k = lo; k < hi; k++) {
			if (i == mid)
				aux[k] = a[j++];
			else if (j == hi)
				aux[k] = a[i++];
			else if (a[j] > a[i])
				aux[k] = a[j++];
			else
				aux[k] = a[i++];
		}
		for (int k = lo; k < hi; k++)
			a[k] = aux[k];

	}

}
