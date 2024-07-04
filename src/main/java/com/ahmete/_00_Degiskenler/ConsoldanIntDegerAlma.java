package com.ahmete._00_Degiskenler;

import java.util.Scanner;

public class ConsoldanIntDegerAlma {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sayi1, sayi2, sonuc;
		System.out.println("1. sayıyı giriniz:");
		sayi1 = sc.nextInt();
		
		System.out.println("2. sayıyı giriniz:");
		sayi2 = sc.nextInt();
		
		sonuc = sayi1 + sayi2;
		System.out.println("Sonuç: " + sonuc);
	}
}