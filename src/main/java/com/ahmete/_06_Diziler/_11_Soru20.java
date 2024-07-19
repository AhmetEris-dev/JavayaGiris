package com.ahmete._06_Diziler;

import java.util.Arrays;
/*
{20,19,20,40,3,40,5,3,7,3} elemanlarından oluşan dizideki elemanlardan sadece tekrarsız olarak yeni bir dizi oluşturunuz.
yeni dizideki elemanlar {20,19,40,3,5,7}

dizi2'ye eleman eklerken bu eleman dizi2de yoksa ekle şeklinde de yapılabilir.
 */

public class _11_Soru20 {
	public static void main(String[] args) {
		int[] dizi1={20,19,20,40,3,40,5,3,7,3};
		int[] dizi2;
		int dizi2Uzunluk = dizi1.length; //10
		//ilk sorunumuz: yeni dizinin eleman sayısını belirleme:
		for (int i = 0; i < dizi1.length; i++) {
			for (int j = i+1; j < dizi1.length; j++) {
				if(dizi1[i]==dizi1[j]) {
					dizi2Uzunluk--;
					break;
				}
			}
		}
		System.out.println("Dizi2 uzunluk="+dizi2Uzunluk);
		dizi2=new int[dizi2Uzunluk];
		
		//Dizi2'ye tekrarsız elemanları nasıl ekleyeceğiz?
		boolean esitMi=false;
		int dizi2Index=0;
		for (int i = 0; i < dizi1.length; i++) { //kıyaslanacak bir sayı seçimi
			esitMi=false;
			for (int j = i+1; j < dizi1.length; j++) { // kıyaslanacak sayı ile dizinin geri kalan tüm sayılarını
				// kıyaslama kısmı
				if(dizi1[i]==dizi1[j]) { //tekrar eden değer bulunursa;
					System.out.println("dizi1[i]:"+dizi1[i]);
					esitMi=true;
					break;
				}
			}
			if(!esitMi){ // bunun altındaki kodlar esitMi değeri false iken çalışır.
				dizi2[dizi2Index]=dizi1[i];
				dizi2Index++;
			}
		}
		
		//Dizi2 elemanlarını yazdıralım:
		System.out.println(Arrays.toString(dizi2));
		
	}
}