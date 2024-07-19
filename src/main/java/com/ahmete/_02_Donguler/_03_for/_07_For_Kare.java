package com.ahmete._02_Donguler._03_for;

import java.util.Scanner;
/*
Kullanıcıdan alınan sayı kadar satır ve sütuna sahip yıldız karakteri ile kare çizen programı for ile yazın.
Örnek çıktı:
Boyut giriniz:3
***
***
***
 */

public class _07_For_Kare {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		String yildiz;
		yildiz="*";
		
		int sayi;
		sayi=scanner.nextInt();
		
		for (int j = 1; j <=sayi ; j++) {
			for (int i = 1; i <=sayi ; i++) {
				
				System.out.print(yildiz);
				
			}
			System.out.println(" ");
		}
				
	}
}