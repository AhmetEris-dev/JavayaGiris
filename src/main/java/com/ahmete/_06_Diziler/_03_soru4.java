package com.ahmete._06_Diziler;

import java.util.Arrays;

public class _03_soru4 {
	public static void main(String[] args) {
		isimYaz("Kenan");
		isimYaz(new String[]{"Ece"}); // bir metod parametre olarak varargs kullanıyorsa argüman olarak bir dizi gönderilebilir.
		//isimleriYaz("Murat"); // bir metod String dizisini parametre olarak bekliyorsa, ona argüman olarak String eleman gönderemeyiz.
		String[] isimler=new String[]{"Su"};
		
		isimleriYaz(isimler); // bir metod parametre olarak String dizisi bekliyorsa, ona argüman olarak String dizisi gönderilebilir.
		isimleriYaz(new String[]{"Su"}); // bir metod parametre olarak String dizisi bekliyorsa, ona argüman olarak String dizisi gönderilebilir.
	}
	public static void isimYaz(String... isimler) {
		System.out.println(Arrays.toString(isimler));
	}
	public static void isimleriYaz(String[] isimler) {
		System.out.println(Arrays.toString(isimler));
	}
}