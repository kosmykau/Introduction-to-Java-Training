package array.of.arrays;

import java.util.Scanner;

/*
 10.Найти положительные элементы главной диагонали квадратной матрицы.
 */

public class task10 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
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
		
		System.out.println("\nПоложительные элементы главной диагонали: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(i == j && matrix[i][j] > 0) {
					System.out.printf("%3d", matrix[i][j]);
				}
			}
		}
	}

}
