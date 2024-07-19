package com.ahmete._07_Methods;

//method,function,procedure,subprogram,subroutione
// metodlarla genellikle dışarıdan parametreler aracılıgıyla değerleri alıp işlem yapıp,genellikle geriye değer
// dondururler.

public class _00_Methods {
	//static sınıfa bağlıdır.
	public static void main(String[] args) {
		int toplam = toplam(5, 10);
		System.out.println(toplam);
		
		System.out.println(max(50,70));
	
	}
	
	public  static int toplam(int sayi1, int sayi2) {
		int sonuc = sayi1 + sayi2;
		return sonuc;
	}
	
	public static int max(int a, int b) {
		if (a > b) {
			return a;
		}
		else {
			return b;
		}
	}
}