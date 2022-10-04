/*
 * Пусть даны две неубывающие последовательности действительных чисел
 * a1 <= a2 <= ... <= an и b1 <= b2 <= ... <= bm. Требуется указать те места, на
 * которые нужно вставлять элементы последовательности b1 <= b2 <= ... <= bm в
 * первую последовательность так, чтобы новая последовательность оставалась
 * возрастающей.
 */

package by.jonline.onedimensionarraysorting;

public class Task7 {
	public static void main(String[] args) {

		int[] a = { 3, 4, 5, 7, 8, 10, 11, 12, 13, 14, 15, 16, 22, 24, 25 };
		int[] b = { 1, 2, 6, 9, 17, 18, 19, 20, 21, 23, 26 };
		int[] ab = new int[a.length + b.length];
		int i = 0;
		int j = 0;
		int k = 0;

		while (k < ab.length) {
			if (j == b.length) {
				ab[k++] = a[i++];
				System.out.print(ab[k - 1] + " ");

			} else if (i == a.length) {
				ab[k++] = b[j++];
				System.out.print(ab[k - 1] + " ");

			} else if (b[j] <= a[i]) {
				ab[k++] = b[j++];
				System.out.print(ab[k - 1] + " ");
			} else {
				ab[k++] = a[i++];
				System.out.print(ab[k - 1] + " ");
			}
		}

	}
}
