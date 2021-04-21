package by.jonline.arrayofarray;

import java.util.Random;
import java.util.Scanner;

public class Task12 {

	public static void main(String[] args) {
		int[][] a = new int[5][10];

		Random rand = new Random();
		System.out.println("Задана матрица");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = rand.nextInt(15);
				System.out.print(a[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("Выберитеcr сортировки: 1 - по возрастанию, 2 - по убыванию");
		Scanner input = new Scanner(System.in);
		int userChoice = input.nextInt();
		switch (userChoice) {
		case 1: {
			break;
		}
		case 2: {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: 1, 2");
		}
	}

}
