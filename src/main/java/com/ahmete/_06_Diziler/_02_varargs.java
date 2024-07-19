package com.ahmete._06_Diziler;

public class _02_varargs {
	public static void main(String[] args) {
		
		// variable arguments: bir metoda aynı tipte değişken sayıda değer göndermek için kullanılır.
		// metod parametresinde dizi kullanımının alternatifidir.
		// main metod parametre olarak String[] args almaktadır. yani bir string dizisini parametre olarak olabiliyor.
		// burada String[] args yerine ... args da kullanılabilir. bu yönteme varargs denir
		
		int toplam=topla(5,10,6,50);
		System.out.println(toplam);
		
	}
	// örnek bir metod yazalım
	public  static int topla(int...sayilar){ // ... ile varargs  yöntemi kullanılarak aynı tipte değişken sayıda değer alabildik
		int toplam=0;
		for (int item:sayilar){
		toplam+=item;
		}
		return  toplam;
	}
	
	
}