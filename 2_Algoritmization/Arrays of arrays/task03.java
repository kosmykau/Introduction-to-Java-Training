package array.of.arrays;

import java.util.Scanner;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class task03 {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int k;
		int p;
		
		int[][] matrix = {
				{1, 5, 9, 13},
				{2, 6, 10, 14},
				{3, 7, 11, 15},
				{4, 8, 12, 16},
		};
		
		
		System.out.println("Введите номер строки к >> ");
		k = sc.nextInt();
		
		System.out.println("Введите номер столбца р >> ");
		p = sc.nextInt();
		
		System.out.println("Дана матрица: ");
		printMatrix(matrix);
		
		System.out.println("\nСтрока: ");
		for(int i = 0; i < matrix[k].length; i++) {
			System.out.printf("%3d", matrix[k - 1][i]);
		}
		System.out.println();
		
		System.out.println("\nСтолбец: ");
		for(int j = 0; j < matrix[p].length; j++) {
			System.out.printf("%3d", matrix[j][p - 1]);
		}
			
	}
	
	public static void printMatrix(int[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d", arrays[i][j]);
            }
            System.out.println();
	    }

    }
		
	
}
	

