/*
 * На плоскости заданы своими координатами n точек. Написать метод(методы), определяющие, между какими
 * из пар точек самое большое расстояние. Указание. Координаты точек занести в массив. 
 * 
 * */

package by.jonline.decomposition;

import java.util.Random;
import java.util.Scanner;

public class Task4 {

	public static void main(String[] args) {
		Random rnd = new Random();
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Введите количество точек n");

		int n = input.nextInt();
		int[][] arr = new int[n][2];
		int[] mostDistantPoints = new int[2];

		System.out.println("Даны точки:X  |  Y");
		for (int i = 0; i < arr.length; i++) {
			System.out.println();
			System.out.print("           ");
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = rnd.nextInt(10);
				System.out.print(arr[i][j] + "     ");
			}
		}
		mostDistantPoints = longestDistance(arr);

		System.out.printf("\nНаиболее удалённые точки: x1 = %1$d, y1 = %2$d; x2 = %3$d, y2 = %4$d",
				arr[mostDistantPoints[0]][0], arr[mostDistantPoints[0]][1], arr[mostDistantPoints[1]][0],
				arr[mostDistantPoints[1]][1]);

	}

	static double towPointsDistance(int xa, int xb, int ya, int yb) {
		return Math.sqrt(Math.pow(xa - xb, 2) + Math.pow(ya - yb, 2));
	}

	static int[] longestDistance(int[][] arr) {
		int[] towPoints = new int[2];
		double maxDistance = 0;
		double currentDistance = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				currentDistance = towPointsDistance(arr[i][0], arr[j][0], arr[i][1], arr[j][1]);
				if (maxDistance < currentDistance) {
					maxDistance = currentDistance;
					towPoints[0] = i;
					towPoints[1] = j;
				}
			}
		}

		return towPoints;
	}

}
