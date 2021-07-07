package com.epam.module01.cycles;
//1. Напишите программу, где пользователь вводит любое целое положительное число. А программа суммируетвсе числа от 1 до введенного пользователем числа.
import java.util.Scanner;
public class task01_1 {

    public static void main(String[] args) {
		
	int number;
	int sum = 0;
		
	System.out.println("Введите целое положительное число:");
	Scanner scan = new Scanner(System.in);
	number = scan.nextInt();
		
	for (int i = 1; i <= number; i ++)
	     sum = sum + i;
		
	System.out.println("Сумма чисел о 1 до " + number + " равна " + sum);
	    
	}
}
