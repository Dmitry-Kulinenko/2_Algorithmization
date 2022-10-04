/*
 * Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число 
 * единиц равно номеру столбца
 * */

package by.jonline.arrayofarray;

import java.util.Random;

public class Task14 {

	public static void main(String[] args) {

		Random rand = new Random();
		int m = 0;
		int n = 0;

		do {
			m = rand.nextInt(30);
			n = rand.nextInt(m);
		} while (m < n);

		int[][] matrix = new int[m][n];

		int count;
		for (int i = 0; i < matrix.length; i++) {
			count = i + 1;
			for (int j = 0; j < matrix[i].length; j++) {
				if (count - 1 > 0) {
					matrix[i][j] = 0;
					count--;
				} else {
					matrix[i][j] = 1;
				}
				System.out.printf("%3d ", matrix[i][j]);
			}
			System.out.println();
		}
	}

}
