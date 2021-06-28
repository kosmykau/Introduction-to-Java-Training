package com.epam.module01.main;
//Дано значение a. Не используя никаких функций и никаких операций, кроме умножения,
//получить значение а8 за три операции и а10 за четыре операции.
public class Main27 {
	
	public static void main(String[] args) {
		
		double a = 2.0;
		
		double a2 = a * a;
		double a4 = a2 * a2;
		double a8 = a4 * a4;
		double a10 = a2 * a8;
		
		System.out.println("При а = " + a + "\na8 = " + a8 + "\na10 = " + a10);
		
	}

}
