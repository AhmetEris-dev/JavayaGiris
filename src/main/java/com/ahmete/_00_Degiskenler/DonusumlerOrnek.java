package com.ahmete._00_Degiskenler;

public class DonusumlerOrnek {
	public static void main(String[] args) {
		byte b;
		int i=257;
		double d=323.142;
		
		System.out.println("int>>byte dönüşümü:");
		b=(byte)i;
		System.out.println("i="+i+" b = "+b);
		
		System.out.println("double >> int dönüşümü:");
		i=(int)d;
		System.out.println("d="+d+" i = "+i);
		
		System.out.println("double>>byte dönüşümü:");
		b=(byte)d;
		System.out.println("d="+d+" b = "+b);
		
	}
}