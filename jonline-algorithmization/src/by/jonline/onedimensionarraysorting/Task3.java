/*
 *Сортировка выбором. Дана последовательность чисел a1<=a2<=..<=an .Требуется переставить элементы так,
 *чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
 *элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
 *повторяется. Написать алгоритм сортировки выбором. 
 * 
 * */

package by.jonline.onedimensionarraysorting;

import java.util.Random;

public class Task3 {
	public static void main(String[] args) {

		int[] a = new int[15];
		Random rand = new Random();
		int max = Integer.MIN_VALUE;
		int swap = 0;
		int maxIndex = 0;

		System.out.println("Задан массив");
		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(15);
			System.out.print(a[i] + " ");
		}
		System.out.println();
		System.out.println("Результат сортировки");

		for (int i = 0; i < a.length; i++) {

			for (int j = i; j < a.length; j++) {
				if (a[j] > max) {
					max = a[j];
					maxIndex = j;
				}
			}
			swap = a[i];
			a[i] = max;
			a[maxIndex] = swap;
			System.out.print(a[i] + " ");

			max = Integer.MIN_VALUE;

		}

	}

}
