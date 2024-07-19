package com.ahmete._07_Methods.sorular;

import java.util.Arrays;

public class Metodlar {
	// soru1: Bir tam sayı dizisini parametre olarak alan ve dizideki sayıların ortalamasını hesaplayarak geri
	// döndüren bir ortalamaHesapla metodunu yazınız.
	
	double ortalamaHesapla(int[] sayilar) {
		double toplam = 0;
		for (int i = 0; i < sayilar.length; i++) {
			toplam += sayilar[i];
		}
		return toplam / sayilar.length;
		
	}
	
	//soru2:Bir tamsayı parametre alan ve  sayının tek olup olmadığını kontrol eden tekMi metodunu yazınız.
	
	boolean tekMi(int tamSayi) {
		return tamSayi % 2 == 1;
	}
	
	//soru3:Bir tam sayı dizisi parametre alan ve  diziyi küçükten büyüğe doğru sıralayarak geri döndüren bir metod
	// yazınız.
	
	//orjinal diziyi bozmadan sıralı yeni bir dizi oluşturarak dönmek için önce kopyaladık.(copyOf metotu kullandık)
	int[] sirala(int[] sayilar) {
		int[] sortedArray = Arrays.copyOf(sayilar, sayilar.length);
		Arrays.sort(sortedArray);
		return sortedArray;
	}
	
	//soru4:iki tamsayi parametre alan ve taban üzeri üs işlemini hesaplayarak sonucu geri döndüren bir metod yazınız
	//5,3 => 5*5*5 =125
	public int usHesapla(int taban, int us) {
		int total = 1;
		for (int i = 0; i < us; i++) {
			total *= taban;
			
		}
		return total;
	}
	
	//soru5:Bir metin parametre alan ve metindeki her kelimeyi tersine çevirerek geri döndüren bir metod yazınız.
	public String[] metindekiKelimeleriBul(String metin) {
		return metin.split(" ");
	}
	
	public String kelimeTersiBul(String[] kelimeler) {
		
		StringBuilder sb = new StringBuilder();
		for (String kelime : kelimeler) {
			sb.append((new StringBuilder(kelime).reverse().append(" ")));
		}
		return sb.toString().trim();
	}
	// Soru 6. Bir tamsayı parametre alan ve sayının asal olup olmadığını kontrol eden asalMi metodunu yazınız.
	
	boolean asalMi(int sayi) {
		if (sayi <= 1) {
			return false;
		}
		else if (sayi == 2) {
			return true;
		}
		else {
			for (int i = 2; i <= Math.sqrt(sayi); i++) {
				if (sayi%i==0){
					return false;
				}
				
			}
			return true;
		}
	}
	
	//soru7:
	
	public int[] enBuyukNSayi(int[] sayilar,int n){
		
		Arrays.sort(sayilar);
		int[] enBuyukSayilar=new int[n];
		for (int i = 0; i <n ; i++) {
			enBuyukSayilar[i]=sayilar[sayilar.length-1-i];
		}
		return enBuyukSayilar;
	}
	//soru12.
	
	int kucukHarfSay(String metin){
		int count=0;
		for (int i = 0; i <metin.length() ; i++) {
			if (Character.isLowerCase(metin.charAt(i))){
				count++;
			}
			
		}
		return count;
	}
	int buyukHarfSay(String metin){
		int count=0;
		for (int i = 0; i <metin.length() ; i++) {
			if (Character.isUpperCase(metin.charAt(i))){
				count++;
			}
			
		}
		return count;
	}
	
	
}