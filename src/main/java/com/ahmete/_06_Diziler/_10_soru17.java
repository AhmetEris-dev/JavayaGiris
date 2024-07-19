package com.ahmete._06_Diziler;
/*
Dizideki bir öğeyi arama
5 elemanlı elemanları kullanıcı tarafından girilen bir dizi oluşturun.
kullanıcının girdiği sayı dizide varsa BULUNDU, yoksa BULUNAMADI şeklinde mesaj versin
 */

import java.util.Scanner;

public class _10_soru17 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int[] dizi=new int[5];
		
		System.out.println("dizi elemanlarını giriniz");
		for (int i = 0; i < dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz");
			dizi[i]=input.nextInt();
			
		}
		System.out.println("dizide aranacak değeri giriniz");
		int aranan=input.nextInt();
		
		//flag mantığı
		boolean bulunduMu=false;
		
		for (int i = 0; i < dizi.length ; i++) {
			
			if (dizi[i]==aranan){
				bulunduMu=true;
				break;
			}
			
		}
		if (bulunduMu){
			System.out.println("bulundu- aranan değer dizide var");
		}else {
			System.out.println("bulunmadı - aranan değer dizide yok");
		}
		
	}
}