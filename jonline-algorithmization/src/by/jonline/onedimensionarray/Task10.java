/*
 * Дан целочисленный массив с количеством элементов n. Сжать массив, выбросив из него 
 * каждый второй элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.
 * */

package by.jonline.onedimensionarray;

public class Task10 {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 };
		System.out.println("Исходный массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");

		}

		for (int i = 1; i < a.length; i += 2) {
			a[i] = 0;
		}

		for (int i = 1, j = 2; j < a.length; i++, j += 2) {
			a[i] = a[j];
			a[j] = 0;

		}

		System.out.println();
		System.out.println("Полученный массив:");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

}
