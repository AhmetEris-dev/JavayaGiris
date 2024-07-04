package com.ahmete._01_KararYapilari;

import java.math.BigDecimal;

public class _15_BigDecimal {
	public static void main(String[] args) {
		float sonucFloat=0.1f+0.1f+0.1f+0.1f+0.1f+0.1f+0.1f;
		System.out.println(sonucFloat);
		
		double sonucDouble=0.1+0.1+0.1+0.1+0.1+0.1+0.1;
		System.out.println(sonucDouble);
		
		double sonucDouble2=0.1*0.1;
		System.out.println(sonucDouble2);
		
		//BigDecimal sınıfında toplama için add, çarpma için multiply, çıkarma için subtract, bölme için divide
		// metodları kullanılabilir.;
		
		BigDecimal sayi=new BigDecimal("0.1");
		//BigDecimal sonucBigDecimal=sayi.add(sayi).add(sayi).add(sayi).add(sayi).add(sayi).add(sayi);
		//System.out.println(sonucBigDecimal);
		BigDecimal sonucBigDecimal=new BigDecimal("0.0");
		//Döngü ile yapalım:
		for (int i = 0; i < 7; i++) {
			sonucBigDecimal=sonucBigDecimal.add(sayi);
		}
		System.out.println(sonucBigDecimal);
		
		/*BigDecimal sonucBigDecimal2=sayi.multiply(sayi);
		System.out.println(sonucBigDecimal2);*/
	}
}