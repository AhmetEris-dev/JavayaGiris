package com.ahmete._07_Methods;

public class _02_TekParametreLiMethod {
	public static void main(String[] args) {
		baslikYazdir("tek parametreli metodlar");
		
		int sonuc = karesi(5);
		System.out.println(sonuc);
		
		System.out.println(onKati(20));
		
	}
	public static int karesi(int sayi){
		return sayi*sayi;
	}
	public static int onKati(int sayi){
		return sayi*10;
	}
	
	public  static void baslikYazdir(String baslik){
		System.out.println("*******************");
		System.out.println("******"+baslik+"*****");
		System.out.println("*******************");
	}
}