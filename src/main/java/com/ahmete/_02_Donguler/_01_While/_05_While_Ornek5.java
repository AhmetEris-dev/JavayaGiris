package com.ahmete._02_Donguler._01_While;
/*
Kullanıcıdan alınan kelime ile kelimenin tersten yazılışı aynı ise: "Polindrom", değilse "Polindrom Değil" yazdıran
programı yazın
 */

import java.util.Scanner;

public class _05_While_Ornek5 {
	public static void main(String[] args) {
		//charAt,length ve while ile kelimenin tersini bul, equals ile eşitliğini kontrol et.
		
		//Adım 1: Kullanıcıdan kelime alma:
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz:");
		String kelime = sc.next();
		String kelimeTers = "";
		
		//Adım 2: Kelimenin Tersini bulma:
		// 012345
		// deneme   => eme
		
		
		// kelek
		
		int uzunluk = kelime.length(); //6
		int index = uzunluk - 1; //5
		
		while (index >= 0) {
			kelimeTers += kelime.charAt(index);
			index--;
		}
		System.out.println(kelimeTers);
		
		//Adım 3: Kelime ve KelimeTersinin eşitliğini kontrol etme:
		if (kelime.equalsIgnoreCase(kelimeTers)) {
			System.out.println("Girilen kelime Polindromdur");
		}
		else {
			System.out.println("Girilen kelime Polindrom Değildir.");
		}
		
	}
}