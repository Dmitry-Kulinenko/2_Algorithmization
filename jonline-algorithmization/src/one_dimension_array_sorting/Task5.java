/*
 *Сортировка вставками. Дана последовательность чисел                      
 *Делается это следующим образом. Пусть a 1 , a 2 , ... , a i - упорядоченная 
 *последовательность, т. е. a 1 <= a 2 <= ... <= a n . Берется следующее      
 *a 1 , a 2 , ... , a n . Требуется переставить числа в порядке возрастания.  
 *число a i + 1 и вставляется в последовательность так, чтобы новая           
 *последовательность была тоже возрастающей. Процесс производится до тех пор, 
 *пока все элементы от i +1 до n не будут перебраны. Примечание. Место        
 *помещения очередного элемента в отсортированную часть производить с помощью 
 *двоичного поиска. Двоичный поиск оформить в виде отдельной функции.  
 * 
 * */

package one_dimension_array_sorting;

import java.util.Random;

public class Task5 {
	public static int binarySearch(int arr[], int firstElement, int lastElement, int elementToInsert) {
		// Метод возвращает индекс элемента, который может быть меньше или больше
		// вставляемого числа
		int mid = firstElement + (lastElement - firstElement) / 2;

		if (mid == firstElement)
			return mid;

		if (elementToInsert > arr[mid])
			return binarySearch(arr, mid, lastElement, elementToInsert);
		else
			return binarySearch(arr, firstElement, mid, elementToInsert);

	}

	public static void main(String[] args) {

		int[] a = new int[15];
		int insertIndex = 0;
		int[] result = new int[a.length];

		Random rand = new Random();

		System.out.println("Задан массив");

		for (int i = 0; i < a.length; i++) {
			a[i] = rand.nextInt(15);
			System.out.print(a[i] + " ");
		}

		result[0] = a[0];// исходный отсортированный массив

		for (int i = 1; i < a.length; i++) {

			insertIndex = binarySearch(result, 0, i, a[i]);

			if (result[insertIndex] > a[i]) {// если a[i] больше числа с полученым индексом,
												// сдвигаем массив вправо без этого числа.
												// Если меньше-сдвигаем вместе с числом.
				for (int j = result.length - 1; j > insertIndex; j--) {
					result[j] = result[j - 1];
				}
				result[insertIndex] = a[i];
			} else {
				for (int j = result.length - 1; j > insertIndex + 1; j--) {
					result[j] = result[j - 1];
				}
				result[insertIndex + 1] = a[i];
			}

		}
		System.out.println("Результат");
		for (int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");

		}

	}
}
