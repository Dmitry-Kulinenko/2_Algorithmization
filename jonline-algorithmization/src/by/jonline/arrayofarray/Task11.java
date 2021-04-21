package by.jonline.arrayofarray;

import java.util.Random;

public class Task11 {

	public static void main(String[] args) {
		int[][] a = new int[10][20];
		int[] rowNumbers = new int[a.length];
		int n = 0;
		Random rand = new Random();
		System.out.println("Задана матрица");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
				System.out.print(a[i][j] + "\t");
				if (a[i][j] == 5) {
					n++;
				}

			}
			if (n >= 3) {
				rowNumbers[i]++;
			}
			n = 0;
			System.out.println();
		}
		System.out.println("Номера строк, в которых число 5 встречается три и более раз ");
		for (int i = 0; i < rowNumbers.length; i++) {
			if (rowNumbers[i] > 0) {
				System.out.println(i + 1);
			}
		}
	}

}
