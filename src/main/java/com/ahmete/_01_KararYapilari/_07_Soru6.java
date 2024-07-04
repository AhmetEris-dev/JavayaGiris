package com.ahmete._01_KararYapilari;

import java.util.Scanner;

public class _07_Soru6 {
	/*
Kullanıcının girdiği sayının
pozitif,
negatif veya
sıfır olduğunu belirleyen bir program yazmanız gerekiyor.
 Bu durumda if-else-if-else yapısı kullanarak bir program yazabilirsiniz.

 */
	public static void main(String[] args) {
		// Kullanıcıdan bir sayı alma adımları:
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir sayı giriniz:");
		int sayi = sc.nextInt();
		
		//Mantıksal Kıyaslama Adımları:
		if(sayi<0){
			System.out.println(sayi+" negatif bir sayıdır.");
		}
		else if(sayi>0) {
			System.out.println(sayi +" pozitif bir sayıdır.");
		}
		else{
			System.out.println("Girilen sayı 0'dır...");
		}
	}
}