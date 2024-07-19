package com.ahmete._07_Methods;

//extract ile otomatik metod oluşturma

public class _07_MethodExtract {
	public static void main(String[] args) {
		String deger="başlık";
		baslikYaz(deger);
		
		carp(3,4,5,6,7,8,1,10); //metodu yazıp Alt+Enter tuşlarına basarak IDE'nin olmayan metodu oluşturmasını sağlar
	}
	
	private static void carp(int i, int i1, int i2, int i3, int i4, int i5, int i6, int i7) {
	
	}
	
	private static void baslikYaz(String deger) {
		System.out.println("********************");
		System.out.println("********"+ deger +"************");
		System.out.println("********************");
	}
	
}