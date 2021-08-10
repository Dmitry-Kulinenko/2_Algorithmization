/*
 * Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д. 
 * Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.
 * 
 * */

package by.jonline.decomposition;

import java.util.Scanner;

public class Task17 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);

		System.out.println("Введите число");

		int n = input.nextInt();

		System.out.println("Количество действий: " + getCounter(n));

	}

	static int getCounter(int number) {
		int sum = getSum(number);
		int counter = 0;

		while (sum > 0) {
			System.out.println(sum);
			sum -= getSum(sum);
			counter++;
		}
		return counter;
	}

	static int getSum(int number) {
		int sum = 0;
		while (number > 0) {
			sum += number % 10;
			number = number / 10;
		}
		return sum;
	}
}
