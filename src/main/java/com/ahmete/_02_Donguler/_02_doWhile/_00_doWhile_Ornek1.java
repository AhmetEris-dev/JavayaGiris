package com.ahmete._02_Donguler._02_doWhile;
/*
Do While bloğu
While bloğundan farkı: koşul sağlanmasa bile en az 1 defa çalışır.
while'dan sonra ; koymayı unutmayın!

do{
			//yapılacak işlemler
		}while(koşul);
 */


import java.util.Scanner;

public class _00_doWhile_Ornek1 {
	/*
Kullanıcıdan alınan sayıların toplamını hesaplayan bir java programı do while ile yazın.( Kullanıcı 0 girene kadar program çalışmaya devam etsin.)
 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int sayi;
		int toplam = 0;
		
		do {
			System.out.println("Bir sayı girin (0'a basarak sonlandırabilirsiniz)");
			sayi = sc.nextInt();
			toplam += sayi;
		}while (sayi != 0);
		
		System.out.println(toplam);
	}
}