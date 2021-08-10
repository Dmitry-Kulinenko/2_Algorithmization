/*
 * Сортировка обменами. Дана последовательность чисел a1<=a2<=..<=an .Требуется переставить числа в
 * порядке возрастания. Для этого сравниваются два соседних числа ai+ai+1 . Если ai>ai+1 , то делается
 * перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
 * Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
 * 
 * */

package by.jonline.one_dimension_array_sorting;

import java.util.Random;

public class Task4 {
	public static void main(String[] args) {
		int[] a = new int[15];
		Random rand = new Random();
		int swap = 0;
		int counter1 = 0; // Количество перестановок
		int counter2 = 0; // Смотрим во внешнем цикле, изменилось ли кол-во перестановок.
							// Если внутренний цикл отработал без перестановок, значит массив отсортирован.

		System.out.println("Задан массив");

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(15);
			System.out.print(a[i] + " ");
		}

		do {
			counter2 = counter1;
			for (int i = 0; i < a.length - 1; i++) {
				if (a[i] > a[i + 1]) {
					swap = a[i];
					a[i] = a[i + 1];
					a[i + 1] = swap;
					counter1++;
				}
			}

		} while (counter1 != counter2);

		System.out.printf("%nРезультат сортировки%n");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.printf("%nКол-во перестановок: " + counter1);
	}

}
