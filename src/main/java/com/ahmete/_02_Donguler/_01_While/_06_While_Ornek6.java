package com.ahmete._02_Donguler._01_While;
/*
1'den 100'e kadar olan sayıların toplamını while ile hesaplayan bir program yazınız:
 */

public class _06_While_Ornek6 {
	public static void main(String[] args) {
		int i= 1,toplam=0;
		while(i<=100){
			toplam+=i;
			i++;
		}
		System.out.println(toplam);
		
	}
}