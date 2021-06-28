package com.epam.module01.main;
//Даны натуральные числа M и N. Вывести старшую цифру дробной части и младшую цифру целой части числа M/N.
public class Main35 {
	
	public static void main(String[] args) {
		
		int M = 50;
		int N = 4;
		
		double result = (double) M / N;
		
		int younger = (int)	(result % 10);
		int older = (int) ((result * 10) % 10);
		
		System.out.println(M + " / " + N + " = " + result);
		System.out.println("Старшая цифра дробной части: " +older);
		System.out.println("Младшая цифра целой части: " + younger);
		
		
		
	}

}
