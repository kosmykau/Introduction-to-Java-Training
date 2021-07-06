package com.epam.module01.branching;
//2. Найти max{min(a, b), min(c, d)}.
public class task02 {

	public static void main(String[] args) {
		
		int max, min1, min2;
	
		int a = 2;
		int b = 3;
		int c = 1;
		int d = 5;
		
		if (a < b) {
			min1 = a;
		}else {
			min1 = b;
		}	
		if (c < d) {
			min2 = c;
		}else {
			min2 = d;
		}
		if (min1 > min2) {
			max = min1;
		}else {
			max = min2;
		}
		
		System.out.println("Max = " + max);
	}

}

