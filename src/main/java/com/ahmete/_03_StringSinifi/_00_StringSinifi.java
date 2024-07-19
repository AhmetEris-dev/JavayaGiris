package com.ahmete._03_StringSinifi;

public class _00_StringSinifi {
	public static void main(String[] args) {
		
		// String sınıfından constructor ile nesne oluşturma
		String ad=new String("ahmet");
		
		// "" ile String nesnesi oluşturma
		String soyad="eris";
		
		
		//String sınıfı final keywordlü bir sınıftır Final keywordü eğer sınıftan kullanılırsa o sınıftan miraz alamaz
		//String sınıfı java.io.Serializab,Comparable<String>,CharSequence,Constable,ConstantDesc interfacelerinden implemente almıştır
		
		//Mutable X Immutable
		//String sınıfı immutable bir sınıftır değiştirelemez demektir
		soyad+="R";
		
		
	}
	
	
}