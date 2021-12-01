package Decomposition;

/*
 * 5. Составить программу, которая в массиве A[N] находит второе по величине число (вывести на печать число, которое меньше максимального
 *  элемента массива, но больше всех других элементов).
 */

public class task05 {

	public static void main(String[] args) {
		int[] array = {2, 4, 10, 8, 64, 97, 1, 13, 25, 44, 68, 5};
		
		System.out.println("Второe по величине число в массиве = " +secondMax(array));

	}
	
	public static int secondMax (int[] array) {
		int max = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > max) {
				max = array[i];
			}
		}
		
		int secondMax = array[0];
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > secondMax && array[i] < max) {
				secondMax = array[i];
			}
		}
		return secondMax;
	}
	

}
