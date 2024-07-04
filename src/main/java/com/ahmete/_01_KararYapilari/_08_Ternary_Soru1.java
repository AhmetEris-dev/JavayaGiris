package com.ahmete._01_KararYapilari;

/*
Bir öğrencinin notunu aldığımızda,
notu 50'den büyük veya eşitse "Geçer",
küçükse "Kaldı" şeklinde bir durum göstermek için ternary operatörü kullanılarak programı yazınız.

 */

public class _08_Ternary_Soru1 {
	public static void main(String[] args) {
		int not = 20;
		String sonuc = (not <= 50 && not > 0) ? (not > 30) ? "DD" : "Kaldı" : "Geçti";
		System.out.println(sonuc);
		
		
	}
}