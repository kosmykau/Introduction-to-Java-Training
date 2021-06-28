package com.epam.module01.main;
//Ввести любой символ и определить его порядковый номер, а также указать предыдущий и последующий символы.
public class Main33 {
	
	public static void main(String[] args) {
		
		char currentCharacter = 'G';
		
		int simCurrent = (int) currentCharacter;
		
		int simPrev = simCurrent -1;
		char prevCharacter = (char) simPrev;
		
		int asciiNext = simCurrent +1;
		char nextCharacter = (char) asciiNext;
		
		System.out.println("Исходный символ: " + currentCharacter + ", его номер: " + simCurrent);
		System.out.println("Предыдущий символ: " + prevCharacter + ", его номер: " + simPrev);
		System.out.println("Следующий символ: " + nextCharacter + ", его номер: " + asciiNext);
		
	}

}
