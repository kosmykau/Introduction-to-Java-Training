package com.epam.module01.main;
//Дано натуральное число Т, которое представляет длительность прошедшего времени в секундах.
//Вывести данное значение длительности в минутах и секундах на следующей форме:
//ННч ММмин SSс
public class Main22 {
	
	public static void main(String[] args) {
		
		int number = 5678;
		
		int hours = (number / 3600);
		int temp = number - (hours * 3600);
		int minutes = temp / 60;
		int seconds = temp - (minutes * 60);
		
		System.out.println("Исходная длительность в секундах: " + number);
		System.out.println(hours + "ч " + minutes + "мин " + seconds + "с");
		
		
		
	}

}
