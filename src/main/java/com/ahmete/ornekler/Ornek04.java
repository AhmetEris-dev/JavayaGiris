package com.ahmete.ornekler;

import java.util.ArrayList;
import java.util.List;

public class Ornek04 {
	public static void main(String[] args) {
		List<String> list = List.of("a", "b", "c");
		ArrayList<String> list2 = new ArrayList<>(list);
		int a=5;
		System.out.println(a);
		if(a>3){
			int b=10;
			System.out.println(a);
			System.out.println(b);
		}
		System.out.println(a);
		//System.out.println(b); HATA!!! Scope dışından erişim sağlanamaz.
		System.out.println("ifden sonraki kod çalıştı");
		topla(8,3);
		topla(10,5);
		System.out.println("Artık son satır burası.");
		
		{
			int c=20;
			System.out.println(c);
		}
		//System.out.println(c);
		
		
		
	}
	
	public static void topla(int sayi1,int sayi2){
		System.out.println("topla metodu çalıştı.");
		System.out.println(sayi1+sayi2);
	}
	
}

class AltClass2{
	
	public static void main(String[] args) {
		System.out.println("Alt Class2 Maini Çalıştı，");
	}
}