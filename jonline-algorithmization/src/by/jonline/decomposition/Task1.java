/*  
 * Написать метод(методы) для нахождения наибольшего общего делителя и 
 * наименьшего общего кратного двух натуральных чисел.
 */
package by.jonline.decomposition;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		int a;
		int b;

		System.out.printf("Найти НОК натуральных чисел a и b\nВедите число a\n");
		a = input.nextInt();

		System.out.println("Введите число b");
		b = input.nextInt();

		System.out.printf("НОК %1$d и %2$d равен %3$d", a, b, lcm(a, b));
	}

	static int gcd(int a, int b) {

		return b == 0 ? a : gcd(b, a % b);

	}

	static int lcm(int a, int b) {

		return a / gcd(a, b) * b;

	}
}
