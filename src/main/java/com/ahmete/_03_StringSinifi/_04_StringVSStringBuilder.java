package com.ahmete._03_StringSinifi;

public class _04_StringVSStringBuilder {
	public static void main(String[] args) {
		int islemAdet=100_000;
		long startTime= System.currentTimeMillis();
		StringBuilder sb=new StringBuilder();
		sb.append("Hello");
		for (int i = 0; i <islemAdet ; i++) {
			sb.append(i);
			//System.out.println(sb);
		}
		long endTime= System.currentTimeMillis();
		System.out.println("StringBuilder ile "+islemAdet+" islem sonucunda geçen süre:"+(endTime-startTime)+" .ms'dir");
		//StringBuilder ile 100000 islem sonucunda geçen süre:11 .ms'dir
		
	}
}