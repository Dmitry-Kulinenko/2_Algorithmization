/*
 * Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 *  
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите разряд чисел n");

		int n = input.nextInt();
		int[] array = new int[n];
		int oddSum = getOddSum(array);

		System.out.println("Сумма всех чисел с нечётными цифрами равна: " + oddSum);
		System.out.println("Количество чётных цифр в найденной сумме: " + getEven(oddSum));

	}

	static int getOddSum(int[] array) {

		for (int j = 0; j < array.length; j++) {
			array[j] = 1;
		}

		int i = array.length - 1;

		int result = getSum(array);

		while (i >= 0) {

			if (array[i] < 9) {
				array[i] += 2;
				if (i < array.length - 1) {
					i++;
				}
				result += getSum(array);

			} else {
				array[i] = 1;
				i--;
			}
		}

		return result;
	}

	static int getSum(int[] array) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			sum += array[i] * Math.pow(10, array.length - i - 1);
		}
		return sum;
	}

	static int getEven(int sum) {
		int count = 0;
		do {
			if (sum % 2 == 0) {
				count++;
			}
			sum = sum / 10;
		} while (sum > 0);

		return count;

	}

}
