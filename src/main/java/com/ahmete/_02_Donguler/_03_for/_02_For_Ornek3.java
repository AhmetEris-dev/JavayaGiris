package com.ahmete._02_Donguler._03_for;
// 1 den n e kadar olan sayıların toplamını for dongusu ile yazdırın

import java.util.Scanner;

public class _02_For_Ornek3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi;
		sayi =scanner.nextInt();
		int toplam=0;
		
		
		
		for (int i = 1; i <= sayi ; i++) {
			toplam+=i;
			
			
			
		}
		System.out.println(toplam);
		
		
	}
}