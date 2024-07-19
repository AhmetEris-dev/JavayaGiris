package com.ahmete._03_StringSinifi;

public class _03_StringVSStringBuilder {
	public static void main(String[] args) {
		int islemAdet=100_000;
		long startTime= System.currentTimeMillis();
		String metin="Hello";
		for (int i = 0; i <islemAdet ; i++) {
			metin+=i;
			//System.out.println(metin);
		}
		long endTime= System.currentTimeMillis();
		System.out.println("String ile "+islemAdet+" islem sonucunda geçen süre:"+(endTime-startTime)+" .ms'dir");
		//String ile 100000 islem sonucunda geçen süre:3719 .ms'dir.
	}
}