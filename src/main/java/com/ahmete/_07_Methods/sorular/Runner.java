package com.ahmete._07_Methods.sorular;

import java.util.Arrays;

public class Runner {
	public static void main(String[] args) {
	Metodlar metodlar=new Metodlar();
	//soru1:
	int[] ornekDizi={5,40,30,20,25};
	 double ortalama=metodlar.ortalamaHesapla(ornekDizi);
		System.out.println("ortalama: "+ortalama);
		
		double ortlama2 = metodlar.ortalamaHesapla(new int[]{5, 10});
		System.out.println("ortalama: "+ortlama2);
		
		//soru2
		int sayi1=10;
		int sayi2=17;
		boolean tekMi1 = metodlar.tekMi(sayi1);
		boolean tekMi2 = metodlar.tekMi(sayi2);
		
		System.out.println(tekMi1+"\n"+tekMi2);
		
		//soru3
		int[] siralanmisDizi = metodlar.sirala(ornekDizi);
		System.out.println("siralanmisDizi"+ Arrays.toString(siralanmisDizi));
		System.out.println("ornekDizi"+ Arrays.toString(ornekDizi));
		
		//soru4
		System.out.println(metodlar.usHesapla(5,3));
		
		//soru5
		String metin="bugun hava cok güzel";
		String [] kelimeler=metodlar.metindekiKelimeleriBul(metin);
		System.out.println(Arrays.toString(kelimeler));
		
		String kelimeTersi=metodlar.kelimeTersiBul(kelimeler);
		System.out.println(kelimeTersi);
		
		//soru6
		System.out.println(metodlar.asalMi(1));
		System.out.println(metodlar.asalMi(2));
		System.out.println(metodlar.asalMi(11));
		System.out.println(metodlar.asalMi(8));
		
		//soru7
		int[] ornekDizi2={5,20,25,10,25};
		int[] enBuyuk3Sayi=metodlar.enBuyukNSayi(ornekDizi2,3);
		System.out.println(Arrays.toString(enBuyuk3Sayi));
		
		//soru12
		//kucukharfsay
		
		String metin2="USA'da hava cok Guzel";
		System.out.println(metodlar.kucukHarfSay(metin2));
		
		//buyukharfsay
		System.out.println(metodlar.buyukHarfSay(metin2));
		
		
	}
}