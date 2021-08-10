/*
 * Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
 *  
 * */

package by.jonline.decomposition;

public class Task7 {

	public static void main(String[] args) {
		System.out.println("Сумма факториалов нечётных чисел от 1 до 9 равна: " + factorial());
	}

	static long factorial() {
		long sum = 0;
		long result = 1;
		for (long i = 1; i <= 9; i += 2) {
			result = 1;
			for (long j = 1; j <= i; j++) {
				result *= j;
			}
			sum += result;
		}
		return sum;

	}
}
