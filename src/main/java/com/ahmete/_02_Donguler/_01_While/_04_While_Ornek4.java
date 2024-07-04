package com.ahmete._02_Donguler._01_While;

import java.util.Scanner;

public class _04_While_Ornek4 {
	/*
Kullanıcının girdiği kelimenin harf sayısını while ile bulan programı yazınız.
Deneme 6
 */
	public static void main(String[] args) {
		//         01234
		String ad="Barış";
		char karakter = ad.charAt(2); //charAt ile parametre olarak verilen index değerindeki karakter alınabilir.
		System.out.println(karakter);
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Bir kelime giriniz:");
		String kelime = sc.next(); //Deneme
		System.out.println("length ile sonuç="+kelime.length());
		int index=0;
		while(true){
			try {
				kelime.charAt(index); //Deneme
				index++;
			}
			catch (Exception e) {
				//catch bloğu try bloğunda bir hata meydana geldiğinde çalışır.
				break;
			}
			
		}
		System.out.println(kelime+" harf sayısı="+index);
		
		
	}
}