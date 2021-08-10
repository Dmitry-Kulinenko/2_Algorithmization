/*
 * Даны две последовательности  a 1 <= a 2 <= ... <= a n  и b 1 <= b 2 <= ... <= b m. 
 * Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей. 
 * Примечание. Дополнительный массив не использовать.
 * 
 * */

package one_dimension_array_sorting;

public class Task2 {

	public static void main(String[] args) {
		int[] a = { 1, 3, 5, 7, 9, 11 };
		int[] b = { 0, 1, 1, 10, 12, 165, 174, 300 };
		int i = 0, j = 0;
		while (i != a.length || j != b.length) {
			if (i == a.length) {
				System.out.print(b[j++] + " ");

			} else if (j == b.length) {
				System.out.print(a[i++] + " ");

			} else if (a[i] < b[j]) {
				System.out.print(a[i++] + " ");

			} else {
				System.out.print(b[j++] + " ");
			}
		}
	}

}
