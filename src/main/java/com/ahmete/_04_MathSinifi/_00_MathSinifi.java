package com.ahmete._04_MathSinifi;

public class _00_MathSinifi {
	public static void main(String[] args) {
		//Math m1=new Math(); // Math sınıfı constructor'ı private olduğu için nesne oluşturamazsınız.
		System.out.println(Math.E);
		
		// 1. abs: Mutlak Değer döner.
		int sayi1=5;
		int sayi2=-10;
		System.out.println(Math.abs(sayi1));
		System.out.println(Math.abs(sayi2));
		
		//2. max
		System.out.println(Math.max(sayi1,sayi2));
		//3.min
		System.out.println(Math.min(sayi1,sayi2));
		// 3 sayı içinden en küçük olanı Math.min metodu ile nasıl bulabiliriz?
		int sayi3=20;
		System.out.println(Math.min(sayi1, Math.min(sayi2,sayi3)));
		
		//4.pow ( Power Üslü sayı işlemi)
		System.out.println(Math.pow(5,3)); // 5*5*5=125
		
		//5.sqrt (Square Root Karekök Bulma İşlemi)
		System.out.println(Math.sqrt(25));
		
		//6. Yuvarlama İşlemleri
		
		//6.1 ceil : Yukarı yuvarlama
		System.out.println(Math.ceil(5.0000002));
		
		//6.2 floor: Aşağı yuvarlama
		System.out.println(Math.floor(3.99999999999));
		
		//6.3 round: En yakın tam sayıya yuvarlama
		System.out.println(Math.round(4.4999999));
		System.out.println(Math.round(4.50000000000001));
		System.out.println(Math.round(4.5));
		
		//7.random()
		System.out.println(Math.random()); // 0-1 arasında rastgele bir sayı üretir.
	}
}