package array.of.arrays;

import java.util.Scanner;
import java.lang.Math;

/*
 8.В числовой матрице поменять местами два любых столбца,
   т. е. все элементы одного столбца поставить на соответствующие им позиции другого,
   а элементы второго переместить в первый. Номера столбцов вводит пользователь с клавиатуры.
 */

public class task08 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int temp;
		int firstColumn;
		int secondColumn;
		
		System.out.print("Введите размеры квадратной матрицы >> ");
		n = sc.nextInt();
		
		int[][] matrix = new int[n][n];
		
		System.out.println("Дана матрица: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = (int) (Math.random() * 5);
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		
		System.out.print("Введите номер первого столбца >> ");
		firstColumn= sc.nextInt();
		
		System.out.print("\nВведите номер второго столбца >> ");
		secondColumn = sc.nextInt();
		
		System.out.println("\nМатрица после замены: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(j == firstColumn - 1) {
					temp = matrix[i][j];
					matrix[i][j] = matrix[i][secondColumn - 1];
					matrix[i][secondColumn - 1] = temp;
				}
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
	}
}
