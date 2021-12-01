package array.of.arrays;
//2. Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
import java.lang.Math;
public class task02 {

	public static void main(String[] args) {
		
		int[][] matrix = new int[3][3];
		
		for(int i = 0; i < matrix.length; i++) {
			for(int j = 0; j < matrix[i].length; j++) {
				matrix[i][j] = (int) (Math.random() * 5);
			}
			
		}	
		System.out.println("Дана квадратная матрица:");
		printMatrix(matrix);	
		
		System.out.println("\nВывести на экран элементы, стоящие на диагонали.");
		printDiagonal(matrix);
	}
	
	public static void printMatrix(int[][] arrays) {
		for (int i = 0; i < arrays.length; i++) {
            for (int j = 0; j < arrays[i].length; j++) {
                System.out.printf("%3d", arrays[i][j]);
            }
            System.out.println();
	    }

    }
	
	public static void printDiagonal(int[][] array) {
		for (int i = 0; i < array.length; ++i) {
                    System.out.printf("%3d", array[i][i]);
                
            }
            System.out.println();
        }
	
}