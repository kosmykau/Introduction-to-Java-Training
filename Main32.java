package com.epam.module01.main;
// Текущее показание электронных часов: m ч(0<= m <= 23) n мин (0<= n <= 59) к с (0 <= k <= 59). Какое время будут показывать
//часы через p ч q м r c?
public class Main32 {

	public static void main(String[] args) {
		
		int hoursCurrent = 12;
		int minutesCurrent = 20;
		int secondsCurrent = 37;
		
		int hoursInterval = 2;
		int minutesInterval = 44;
		int secondsInterval = 07;
		
		int currentInSeconds = hoursCurrent * 3600 + minutesCurrent * 60 + secondsCurrent;
		int intervalInSeconds = hoursInterval * 3600 + minutesInterval * 60 + secondsInterval;
		
		int finalInSeconds = currentInSeconds + intervalInSeconds;
		
		int hoursFinal = (finalInSeconds / 3600);
		
		int temp = finalInSeconds - (hoursFinal * 3600);
		
		int minutesFinal = temp / 60;
		
		int secondsFinal = temp - (minutesFinal * 60);
		
		int hours24Format = 0;
		if (hoursFinal > 23) {
			temp =(hoursFinal / 24);
			hours24Format = hoursFinal - temp * 24;
		}
		else {
			hours24Format = hoursFinal;
		}
		
		System.out.println("Сейчас " + hoursCurrent + " ч " + minutesCurrent + " мин " + secondsCurrent + " с");
		System.out.println("Через: " + hoursInterval + " ч " + minutesInterval + " мин " + secondsInterval + " c");
		System.out.println("Будет: " + hours24Format + " ч " + minutesFinal + " мин " + secondsFinal + " c");
		}
		
	}

