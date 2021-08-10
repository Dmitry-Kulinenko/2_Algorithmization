/*
 *  Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить
 *  его по возрастанию. Делается это следующим образом: сравниваются два соседих
 *  элемента ai и a(i + 1). Если ai <= a(i + 1), то продвигаются на один
 *  элемент вперед. Если ai > a(i + 1), то производится перестановка и сдвигаются
 *  на один элемент назад. Составить алгоритм этой сортировки.
 */
package one_dimension_array_sorting;

import java.util.Random;

public class Task6 {
	public static void main(String[] args) {

		int[] a = new int[15];
		int pointer = 0;//
		Random rand = new Random();

		System.out.println("Задан массив");

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(15);
			System.out.print(a[i] + " ");
		}

		while (pointer < a.length - 1) {
			if (a[pointer] <= a[pointer + 1]) {
				pointer++;

			} else {
				int temp = a[pointer];
				a[pointer] = a[pointer + 1];
				a[pointer + 1] = temp;

				if (pointer != 0)
					pointer--;

			}
		}
		System.out.println();
		System.out.println("Результат");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}
}
