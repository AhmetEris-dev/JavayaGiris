package com.ahmete._06_Diziler;

import java.util.Random;

// for - random dizi
// rastgele  int  değerlerden(0-100) oluşan 10 elemanlı bir dizi oluşturup ekrana yazdıralım
public class _01_Diziler_Ornek1 {
	public static void main(String[] args) {
		
		// 10 elemanlı dizi tanımlama
		int[] rastgeleSayilar=new int[10]; // tanımlarken girdiğimiz değer eleman sayısıdır
		Random random=new Random();
		
		
		for (int i = 0; i <rastgeleSayilar.length ; i++) {
			rastgeleSayilar[i]=random.nextInt(0,101);
			
		}
		//dizideki elemanları foreach ile yazdıralım
		
		for (int sayi:rastgeleSayilar){
			System.out.println(sayi);
			
		}
		for (int i = 0; i <rastgeleSayilar.length ; i++) {
			System.out.println(i+".indexteki eleamn: "+rastgeleSayilar[i]); //rastgeleSayilar[10] bunu çağırırsan   ArrayIndexOutOfBoundsException hatası alırsın.
			
		}
		
		
		
		
	}
}