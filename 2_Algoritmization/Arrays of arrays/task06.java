package array.of.arrays;

import java.util.Scanner;

/*
 * 6.Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
      1   1   1  ... 1   1   1
      0   1   1  ... 1   1   0
      0   0   1  ... 1   0   0
      .   .   .  ... .   .   .
      0   1   1  ... 1   1   0
      1   1   1  ... 1   1   1
 */

public class task06 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		int count;
		
		System.out.println("Введите четную размерность матрицы n >> ");
		n = sc.nextInt();
		while(n % 2 != 0) {
			System.out.println("Неверный ввод!");
			System.out.println("Введите четную размерность матрицы n >> ");
			n = sc.nextInt();
		}
		
		int[][] matrix = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				matrix[i][j] = 0;
			}
		}
		
		count = 0;
		for(int i = 0; i < n; i++) {
			for(int j = count; j < n - count; j++) {
				matrix[i][j] = 1;
			}
			count++;
		}
		
		count = 0;
		for(int i = n - 1; i >= 0; i--) {
			for(int j = count; j < n - count; j++) {
				matrix[i][j] = 1;
			}
			count++;
		}
		
		System.out.println("Дана матрица: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
