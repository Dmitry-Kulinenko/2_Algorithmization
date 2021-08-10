/* Найти положительные элементы главной диагонали квадратной матрицы.
 * 
 * */

package by.jonline.array_of_array;

import java.util.Arrays;

public class Task10 {

	public static void main(String[] args) {
		int[][] a = { { -5, 2, 3, 4 }, { 6, 8, 1, 0 }, { -4, 3, -7, 9 }, { 1, -8, -6, 7 } };

		System.out.println("Задана матрица");

		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
		}
		System.out.println("Положительные элемениы главной диагонали:");
		for (int i = 0; i < a.length; i++) {
			if (a[i][i] > 0) {
				System.out.println(a[i][i]);
			}
		}
	}

}
