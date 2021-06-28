package com.epam.module01.main;
//Три сопротивления R1, R2 и R3 соединены параллельно. Найдите сопротивление соединения.
public class Main30 {
	
	public static void main(String[] args) {
		
		double R1 = 2.0;
		double R2 = 4.0;
		double R3 = 6.0;
		
		double R = 1 / (1 / R1 + 1 / R2 + 1 / R3);
		
		System.out.println("R1 = " + R1 + "; R2 = " + R2 + "; R3 = " + R3 + ".");
		System.out.println("Сопротивление R = " + R);
		
		
		
	}

}
