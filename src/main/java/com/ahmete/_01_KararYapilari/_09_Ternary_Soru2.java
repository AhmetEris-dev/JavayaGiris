package com.ahmete._01_KararYapilari;
/*
	Bir sayının tek / çift olduğunu ternary operatörü ile belirleyen programı yazınız.
 */

public class _09_Ternary_Soru2 {
	public static void main(String[] args) {
		int sayi=10;
		String sonuc=(sayi%2==0)?"Çift":"Tek";
		
		System.out.println(sonuc);
	}
}