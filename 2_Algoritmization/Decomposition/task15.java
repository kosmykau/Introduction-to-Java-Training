package Decomposition;

import java.util.Scanner;

/*
 * 15. Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
 *  Для решения задачи использовать декомпозицию.

 */

public class task15 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		int n;
		
		System.out.println("Введите натуральную n-значность >>");
		n = sc.nextInt();
		
		increasingSequence(n);
		
	}
	
	public static void increasingSequence(int n) {
		for(int j = 0; j < 8; j++) {
			if(j + n <= 10) {
				for(int i = 1; i < n + 1; i++) {
					System.out.print(j + i - 1);
				}
			}
			System.out.print(" ");
		}
	}

}
