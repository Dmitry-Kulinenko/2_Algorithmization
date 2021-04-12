package by.jonline.arraysOfArrays;

import java.util.Arrays;
import java.util.Scanner;

public class Task8 {
	public static void main(String[] args) {
		int[][] a = { { 1, 4, 6 }, { 2, 5, 7 }, { 3, 6, 8 } };
		int[][] b = { { -1, -4, -6 }, { -2, -5, -7 }, { -3, -6, -8 } };
		System.out.println("Даны матрицы");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]) + "  " + Arrays.toString(b[i]));
		}
		System.out.println("Введите номера столбцов первой и второй матрицы, чтобы поменять их местами");
		Scanner input = new Scanner(System.in);
		int index1 = input.nextInt();
		int index2 = input.nextInt();
		input.close();
		int buf = 0;
		for (int i = 0; i < a.length; i++) {
			buf = a[i][index1];
			a[i][index1] = b[i][index2];
			b[i][index2] = buf;
		}
		System.out.println("Результат");
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]) + "  " + Arrays.toString(b[i]));
		}

	}

}
