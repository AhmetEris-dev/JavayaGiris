package com.ahmete._02_Donguler._03_for;

public class _01_For_Ornek2 {
	public static void main(String[] args) {
		//1'den 10a kadar olan sayıları ekrana for döngüsü ile yazdıralım:
		for (int i = 1; i <=10 ; i++) {
			System.out.println(i);
		}
		//10'dan 1'e kadar olan sayıları ekrana for döngüsü ile yazdıralım:
		for (int i = 10; i >0 ; i--) {
			System.out.println(i);
		}
		
		//for yazım farklı:
		int i = 0;
		for (; i <= 10; i++) {
			System.out.println("-->"+i);
		}
		
		//for yazım farkı:
		int j = 0;
		for (; j <= 10; ) {
			System.out.println("+++ >>"+j);
			j++;
		}
		// 1-100e kadar olan çift sayıları for döngüsü ile yazdırın: (Muzaffer)
		for (int k = 0; k <= 100; k=k+2) {
			System.out.print(k+"-");
		}
	}
}