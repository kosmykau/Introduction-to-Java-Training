package array.of.arrays;

import java.util.Scanner;

/*
 *  4.Сформировать квадратную матрицу порядка n по заданному образцу(n-четное):
      1   2   3    ... n
      n  n-1 n-2  ... 1
      1   2   3   ... n
      n  n-1 n-2  ... 1
      .   .   .  .    .
      .   .   .   .   .
      .   .   .    .  .
      n  n-1 n-2  ... 1
 */

public class task04 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Введите четную размерность матрицы n >> ");
		n = sc.nextInt();
		while(n % 2 != 0) {
			System.out.println("Неверный ввод! ");
			System.out.println("Введите четную размерность матрицы n >> ");
			n = sc.nextInt();
		
			int[][] matrix = new int[n][n];
		
		
			System.out.println("Дана матрица: ");
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < n; j++) {
					if(i % 2 == 0 || i == 0) {
						matrix[i][j] = j + 1;
					}else {
						matrix[i][j] = n - j;
					}
					System.out.printf("%3d", matrix[i][j]);
				}
				System.out.println();
		}
		
	}

	}
}