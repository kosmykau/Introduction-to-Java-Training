package com.epam.module01.main;
//Вычислить длину окружности и площадь круга одного и того же заданного радиуса R
import java.util.Scanner;
public class Main14 {
	
	public static void main(String[] args) {
		
		double S, L, R;
		
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Введите радиус ");
		
		R = scanner.nextDouble();
		
		S = Math.PI * Math.pow(R, 2);
		L = 2 * Math.PI * R;
		
		System.out.println("Площадь круга = " + S + "\nДлина круга = " + L);
		
		
	}

}
