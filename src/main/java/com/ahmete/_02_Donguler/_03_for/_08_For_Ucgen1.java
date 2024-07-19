package com.ahmete._02_Donguler._03_for;

import java.util.Scanner;
/*
Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri ile ucgen çizen programı for ile yazın.
/*
Beklenen çıktı:

Boyut girin: 3
*
**
***
 */
public class _08_For_Ucgen1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		String yildiz;
		yildiz = "*";
		int sayi;
		sayi = scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			for (int j = 1; j <= i; j++) {
				
				System.out.print(yildiz);
				
			}
			System.out.println(" ");
			
		}
	}
}