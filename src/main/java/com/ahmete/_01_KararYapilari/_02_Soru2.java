package com.ahmete._01_KararYapilari;
/**
 * Soru: Bir matematik oyunu yazıyorsunuz ve kullanıcının verilen soruya doğru cevap verip vermediğini kontrol etmeniz gerekiyor.
 * Eğer kullanıcı doğru cevap verirse "Tebrikler! Doğru cevap.", yanlış cevap verirse "Maalesef yanlış cevap, tekrar dene." mesajı gösterilmelidir.
 * int soru=10;
 * int cevap=20;
 *
 */

public class _02_Soru2 {
	public static void main(String[] args) {
		int soru=10;
		int cevap=20;
		
		if(cevap==soru) {
			System.out.println("Tebrikler! Doğru cevap.");
		}
		else {
			System.out.println("Maalesef yanlış cevap, tekrar dene.");
		}
	}
}