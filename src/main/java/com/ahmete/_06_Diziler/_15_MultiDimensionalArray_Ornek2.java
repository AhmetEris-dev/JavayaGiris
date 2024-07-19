package com.ahmete._06_Diziler;

import java.util.Arrays;
import java.util.OptionalInt;

public class _15_MultiDimensionalArray_Ornek2 {
	public static void main(String[] args) {
		int[][] sayilar={
				{1,2,3,4},
				{5,6,7,100},
				{0,10,11,12}
		};
		// her satırın ortalamasıı bulup,ortalama uzerindeki eleman sayisini bulun
		
		//.adım her bir satırın ortalamasını bulma
		for (int i = 0; i < sayilar.length ; i++) {
			 double toplam=0;
			for (int j = 0; j <sayilar[i].length ; j++) {
				toplam+=sayilar[i][j];
			}
			double ortalama=toplam/sayilar[i].length;
			System.out.println(i+". satırın toplam "+toplam+" ortalaması "+ortalama);
			
			int sayac=0;
			for (int j = 0; j <sayilar[i].length ; j++){
				if (sayilar[i][j]>ortalama){
					sayac++;
				}
			}
			System.out.println(i+". satırda ortalama üzerindeki eleman sayısı "+sayac);
			
		
		}
	}
}