package com.epam.module01.main;
//Составить программу перевода радианной меры угла в градусы, минуты и секунды.
public class Main28 {
	
	public static void main(String[] args) {
		
		double Rad = 2.0;
		double Degr = (Rad * 180) / Math.PI;
		
		int degrees = (int) Degr;
		
		double temp = (Degr - degrees) * 60;
		int minutes = (int) temp;
		
		double seconds = (temp - minutes) * 60;
		
		System.out.println("Исходная мера угла в радианах: " +Rad);
		System.out.println(degrees + "гр " + minutes + " мин " + seconds + "с");
	}

}
