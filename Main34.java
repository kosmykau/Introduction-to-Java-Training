package com.epam.module01.main;
//Дана величина А, выражающая объем информации в байтах. Перевести А в более крупные единицы измерения информации.
public class Main34 {
	
	public static void main(String[] args) {
		
		long Bytes = 999999999L;
		
		double kBytes = Bytes / Math.pow(2, 10);
		double mBytes = Bytes / Math.pow(2, 20);
		double gBytes = Bytes / Math.pow(2, 30);
		double tBytes = Bytes/ Math.pow(2, 40);
		
		System.out.println(Bytes + " байт");
		System.out.println(kBytes + " Кб");
		System.out.println(mBytes + "Мб");
		System.out.println(gBytes + " Гб");
		System.out.println(tBytes + " Тб");
		
		
	}

}
