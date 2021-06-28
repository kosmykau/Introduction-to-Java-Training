package com.epam.module01.main;
//Написать программу, которая выводит на экран первые четыре степени числа п. 
public class Main15 {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <= 5; i++) {
			System.out.println("Pi^" + i + " = " + Math.pow(Math.PI, i));
		}
    }
	}

