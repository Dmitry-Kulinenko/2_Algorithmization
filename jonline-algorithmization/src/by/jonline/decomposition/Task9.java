/*
 * Даны числа X, Y, Z, Т — длины сторон четырехугольника. 
 * Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
 * 
 * */

package by.jonline.decomposition;

public class Task9 {

	public static void main(String[] args) {
		int x = 40;
		int y = 21;
		int z = 28;
		int t = 32;

		System.out.printf("Дан четырёхугольник со сторонами: %1$d, %2$d, %3$d, %4$d\n", x, y, z, t);
		System.out.printf("Площадь данного четырёхугольника равна: %1$.3f ", rectangleArea(x, y, z, t));

	}

	static double rectangleArea(int x, int y, int z, int t) {
		double s1 = x * y / 2;
		double d1 = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		double p = (d1 + z + t) / 2;

		return s1 + Math.sqrt(p * (p - d1) * (p - z) * (p - t));

	}
}
