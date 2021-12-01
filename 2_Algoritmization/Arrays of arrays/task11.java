package array.of.arrays;

/*
 11.Матрицу 10x20 заполнить случайными числами от 0 до 15.
    Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
 */

public class task11 {

	public static void main(String[] args) {
		
		int k = 10;
		int p = 20;
		
		int[][] matrix = new int[k][p];
		
		System.out.println("Дана матрица: ");
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < p; j++) {
				matrix[i][j] = (int) (Math.random() * 16);
				System.out.printf("%3d", matrix[i][j]);
			}
			System.out.println();
		}
		
		int counter = 0;
		for(int i = 0; i < k; i++) {
			for(int j = 0; j < p; j++) {
				if(matrix[i][j] == 5) {
					counter++;
				}
			}
			if(counter >= 3) {
				System.out.println("\nВ строке " + i + 1 + " число 5 повторяется три и более раз ");
			}
		}

	}

}
