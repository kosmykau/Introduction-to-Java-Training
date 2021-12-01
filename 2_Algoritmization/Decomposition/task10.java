package Decomposition;

import java.util.Scanner;

/*
 * 10. Дано натуральное число N. Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
 */

public class task10 {

	public static void main(String[] args) {
//		int n = 23456;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Введите натуральное число N >>");
		int nn = sc.nextInt();
		
		System.out.println();
		for(int i = 0; i < getNumber(nn).length; i++) {
			System.out.print("[" + getNumber(nn)[i] + "]");
		}

	}
	
	public static int[] getNumber(int num) {
		int temp = Integer.toString(num).length();
		
		if(num < 0) {
			temp--;
		}
		
		int[] res = new int[temp];
		while(temp-- > 0) {
			res[temp] = num % 10;
			num /= 10;
		}
		return res;
	}

}
