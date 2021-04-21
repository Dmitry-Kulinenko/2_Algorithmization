/*
 * Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
 * 
 * */

package by.jonline.onedimarray;

public class Task4 {

	public static void main(String[] args) {
		double[] a = { -555.222, 1.2, 23.3, Math.PI, Math.E, 12.234, 444.312, };
		double max = a[0];
		double min = a[0];
		int indexMax = 0;
		int indexMin = 0;
		double temp = 0;

		System.out.println("Исходный массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

		for (int i = 0; i < a.length; i++) {
			if (a[i] > max) {
				max = a[i];
				indexMax = i;
			}
			if (a[i] < min) {
				min = a[i];
				indexMin = i;
			}
		}

		temp = a[indexMax];
		a[indexMax] = a[indexMin];
		a[indexMin] = temp;

		System.out.println();
		System.out.println("Итоговый массив: ");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

}
