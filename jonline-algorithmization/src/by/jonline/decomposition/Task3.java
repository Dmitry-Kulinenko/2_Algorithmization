/*
 * Вычислить площадь правильного шестиугольника со стороной а, 
 * используя метод вычисления площади треугольника
 * 
 * */

package by.jonline.decomposition;

public class Task3 {

	public static void main(String[] args) {
		double a = 15;

		System.out.println(
				"Площадь правильного шестиугольника со стороной a равна сумме шести площадей равносторонних треугольников со стороной a");
		System.out.printf("S = %1$.3f", equilateralTriangleArea(a));
	}

	static double equilateralTriangleArea(double a) {
		return Math.pow(a, 2) * Math.sqrt(3) / 4;
	}

}
