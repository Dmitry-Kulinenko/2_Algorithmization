/*
 *Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральнае). Составить программу,
 *которая приводит эти дроби к общему знаменателю и упорядочивает их в  порядке возрастания.
 *
 **/

package one_dimension_array_sorting;

public class Task8 {

	public static int lcm_of_array_elements(int[] element_array) {
		int lcm_of_array_elements = 1;
		int divisor = 2;

		while (true) {
			int counter = 0;
			boolean divisible = false;

			for (int i = 0; i < element_array.length; i++) {

				if (element_array[i] == 1) {
					counter++;
				}

				if (element_array[i] % divisor == 0) {
					divisible = true;
					element_array[i] = element_array[i] / divisor;
				}
			}

			if (divisible) {
				lcm_of_array_elements = lcm_of_array_elements * divisor;
			} else {
				divisor++;
			}

			if (counter == element_array.length) {
				return lcm_of_array_elements;
			}
		}
	}

	public static void sort(int[] a) {
		int pointer = 0;//
		while (pointer < a.length - 1) {
			if (a[pointer] <= a[pointer + 1]) {
				pointer++;

			} else {
				int temp = a[pointer];
				a[pointer] = a[pointer + 1];
				a[pointer + 1] = temp;

				if (pointer != 0)
					pointer--;

			}
		}

	}

	public static void main(String[] args) {

		int[] numerator_array = { 3, 8, 2, 5, 3 };
		int[] denomenator_array = { 2, 9, 3, 4, 5 };
		int common_denominator = 0;

		System.out.println("Даны дроби");

		for (int i = 0; i < numerator_array.length; i++) {
			System.out.print(numerator_array[i] + "/" + denomenator_array[i] + "; ");
		}
		System.out.println();

		common_denominator = lcm_of_array_elements(denomenator_array);//
		System.out.println("Общий знаменатель = " + common_denominator);

		System.out.println("Приведённые дроби");
		for (int i = 0; i < numerator_array.length; i++) {
			numerator_array[i] = common_denominator / numerator_array[i];
			System.out.print(numerator_array[i] + "/" + common_denominator + "; ");
		}

		sort(numerator_array);

		System.out.printf("%nОтсортированные дроби%n");
		for (int i = 0; i < numerator_array.length; i++) {

			System.out.print(numerator_array[i] + "/" + common_denominator + "; ");
		}
	}

}
