/*
 * Составить программу, которая в массиве A[N] находит второе по величине число
 * (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).
 * 
 * */

package by.jonline.decomposition;

import java.util.Random;

public class Task5 {

	public static void main(String[] args) {
		Random rnd = new Random();
		int[] arr = new int[20];

		System.out.println("Дан массив");
		for (int i = 0; i < arr.length; i++) {
			arr[i] = rnd.nextInt(30);
			System.out.print(arr[i] + " ");
		}
		System.out.println();
		System.out.println("Число, которое меньше максимального элемента массива, но больше всех других элементов: "
				+ search(arr));
	}

	static int search(int[] arr) {
		int max = 0;
		int lessMax = 0;

		for (int i = 0; i < arr.length; i++) {
			if (max < arr[i]) {
				max = arr[i];
			}
		}

		for (int i = 0; i < arr.length; i++) {
			if (lessMax < arr[i] && arr[i] < max) {
				lessMax = arr[i];
			}
		}

		return lessMax;
	}

}
