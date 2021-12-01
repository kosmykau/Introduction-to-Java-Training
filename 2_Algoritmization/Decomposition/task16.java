package Decomposition;

/*
 * 16. Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры. 
 * Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.
 */

import java.util.Scanner;

public class task16 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Введите n-значность >> ");
		n = sc.nextInt();
		
		int sum;
		sum = sumOfOddNum(n);		
		System.out.println("Сумма " + n + " - значных чисел, содержащих только нечетные цифры: " + sum);
		
		int evenCount;
		evenCount = evenDigitCounter(sum);
		System.out.println("Количество четных цифр = " + evenCount);		

	}
	
	
	public static int numberLength(int num) {
		
		int numLength = 0;
		while (num != 0) {
			numLength++;
			num = num / 10;
		}
		
		return numLength;
		
	}
	
	public static int sumOfOddNum(int n) {
		
		int start;
		start = (int)Math.pow(10, n - 1);
		
		int sum = 0;
		for (int i = start; i < start * 10; i++) {
			int temp = i;
			int numberLength = numberLength(i);
			while (temp != 0) {
				if ((temp % 10) % 2 != 0) {
					numberLength--;
				}
				temp = temp / 10;
			}
			if (numberLength == 0) {
				sum = sum + i;
			}
		}
		
		return sum;
	}
	
	public static int evenDigitCounter(int num) {
		
		int counter = 0;
		int numLength = numberLength(num);
		for (int i = 1; i <= numLength; i++) {
			int digit = (int)(num / Math.pow(10, i - 1)) % 10;
			if (digit % 2 == 0) {
				counter++;
			}
		}
		
		return counter;
		
	}
}
