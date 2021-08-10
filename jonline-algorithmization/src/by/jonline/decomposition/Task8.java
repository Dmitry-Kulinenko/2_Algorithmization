/*
 * Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
 * Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных элементов массива с номерами от k до m.
 * 
 * */

package by.jonline.decomposition;

import java.util.Random;
import java.util.Scanner;

public class Task8 {

	public static void main(String[] args) {
		Random rnd = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int[] d = new int[20];
		int k;
		int m;

		System.out.println("Дан массив D:");

		for (int i = 0; i < d.length; i++) {
			d[i] = rnd.nextInt(20);
			System.out.print(d[i] + " ");
		}
		System.out.println();
		System.out.println("Введите начало интервала k");
		k = input.nextInt();
		System.out.println("Введите конец интервала m");
		m = input.nextInt();

		System.out.println("Сумма последовательно расположенных элементов равна: " + sumOfRange(d, k, m));

	}

	static int sumOfRange(int[] array, int begin, int end) {

		int sum = 0;
		for (int i = begin; i < end; i++) {
			sum += array[i];
		}
		return sum;
	}
}
