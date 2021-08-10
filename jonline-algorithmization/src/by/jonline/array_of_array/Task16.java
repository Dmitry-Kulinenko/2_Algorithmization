/*
 * Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,..., 2 n 
 * так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
 * собой. Построить такой квадрат. Пример магического квадрата порядка 3:
 * 
 * */

package by.jonline.array_of_array;

import java.util.Scanner;

public class Task16 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите нечётное число >2");
		int n = input.nextInt();

		int[][] magic = new int[n][n];

		int row = n - 1;
		int col = n / 2;
		magic[row][col] = 1;

		for (int i = 2; i <= n * n; i++) {
			if (magic[(row + 1) % n][(col + 1) % n] == 0) {
				row = (row + 1) % n;
				col = (col + 1) % n;
			} else {
				row = (row - 1 + n) % n;

			}
			magic[row][col] = i;
		}

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {

				System.out.print(magic[i][j] + "\t");
			}
			System.out.println();
		}

	}
}
