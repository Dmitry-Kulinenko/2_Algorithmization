/*
 * Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
 * 
 * */

package by.jonline.one_dimension_array;

public class Task5 {

	public static void main(String[] args) {
		int[] a = { 1, 1, 0, 4, 3, 67, 8, 544, 2, 0, 56, 5, 5, 5, 4, 12, 7, 21, 6, 81 };
		for (int i = 0; i < a.length; i++) {
			if (a[i] > i) {
				System.out.print(a[i] + " ");
			}
		}

	}

}