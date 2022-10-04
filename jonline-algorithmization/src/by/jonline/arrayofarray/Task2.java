/*
 * Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
 * */

package by.jonline.arrayofarray;

public class Task2 {

	public static void main(String[] args) {
		int[][] a = { { 5, 2, 6, 8 }, { 1, 2, 7, 2 }, { 3, 2, 10, 7 }, { 4, 2, 3, 6 } };
		System.out.println("Дана матрица");
		for (int i = 0; i < a.length; i++) {
			System.out.println();
			for (int j = 0; j < a.length; j++) {
				System.out.print(a[i][j] + " " + '\t');
			}
		}

		System.out.println();
		System.out.println("Элементы, стоящие на диагонали");
		for (int i = 0, j = 0; i < a.length; i++, j++) {
			System.out.println(a[i][j]);
		}
	}

}
