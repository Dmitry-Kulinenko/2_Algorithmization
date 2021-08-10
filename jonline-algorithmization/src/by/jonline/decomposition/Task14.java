/*
 * Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, 
 * возведенная в степень n, равна самому числу. Найти все числа Армстронга от 1 до k. 
 * Для решения задачи использовать декомпозицию.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task14 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите k");
		int k = input.nextInt();
		getArmstrongNumber(k);

	}

	static void getArmstrongNumber(int k) {
		int number = 1;
		int sum = 0;
		int power = 0;
		int[] digit = null;
		while (number <= k) {
			power = getPower(number);
			digit = new int[power];
			for (int i = 0; i < digit.length; i++) {
				digit[i] = getDigit(number, i);
				sum += Math.pow(digit[i], power);
			}
			if (sum == number) {
				System.out.println(number);
			}
			sum = 0;
			number++;
		}

	}

	static int getPower(int k) {
		int power = 0;
		while (k > 0) {
			k /= 10;
			power++;
		}
		return power;

	}

	static int getDigit(int k, int i) {
		k %= Math.pow(10, i + 1);
		k /= Math.pow(10, i);

		return k;
	}

}
