package com.ahmete._01_KararYapilari;

public class _10_SwitchCase {
	public static void main(String[] args) {
		/*
		switch(ifade){
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			case sabitdeger:
				//buraya çalışacak kodlar gelecek.
			default:
				//buraya diğer durumlara uymayan kodlar gelecek.
		}
		
		
		 */
		int sayi = 10;
		//Switch içine girilebilecek değer tipleri: byte,short,int,char, String
		
		switch (sayi) {
			case 10:
				System.out.println("Değer 10'dur");
				break;
			case 20:
				System.out.println("Değer 20'dir");
				break;
			case 30:
				System.out.println("Değer 30'dur");
				break;
			default:
				System.out.println("Sayi 10-20-30 değildir.");
			
		}
		
		System.out.println("Switchden sonraki kodlar çalışır...");
		
		
		int month = 5;
		String ay = "";
		
		ay=switch (month) {
			case 1-> "Ocak";
			
			case 2-> "S" +
					"ubat";
			
			default->"Değer yanlış.";
			
		};
	}
}