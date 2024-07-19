package com.ahmete._02_Donguler._03_for;

// 1-100 e kadar olan sayıların sadece tek sayıların toplamını for döngüsü ile bulan program
public class _04_For_Ornek5 {
	public static void main(String[] args) {
		
		int toplam=0;
		for (int i = 1; i <= 100; i+=2) {
			
			toplam+=i;
			
		}
		System.out.println(toplam);
	}
}