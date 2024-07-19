package com.ahmete._02_Donguler._01_While;
/*
Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
 */

import java.util.Scanner;

public class _01_While_Ornek2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı girin (0'a basarak sonlandırabilirsiniz)");
		int sayi = sc.nextInt();
		int toplam=0;
		
		while(sayi!=0){
			toplam+=sayi;
			System.out.println("Bir sayı girin (0'a basarak sonlandırabilirsiniz)");
			sayi = sc.nextInt();
			/*System.out.println("Adınızı giriniz:");
			String ad=sc.nextLine();
			System.out.println(ad);*/
		}
		System.out.println(toplam);
		
	}
}