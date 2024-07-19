package com.ahmete._06_Diziler;

//dizideki en kucuk sayiyi bulma

import java.util.Scanner;

public class _09_soru16_01 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("dizi kac elemanlı olsun");
		int[] dizi=new int[input.nextInt()];
		
		System.out.println("dizi elamanlarını giriniz");
		
		for (int i = 0; i < dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz");
			dizi[i]=input.nextInt();
		}
		// en kucuk elemanı bulalalım
		
		int min=dizi[0];
		int minIndex=0;
		for (int i = 0; i <dizi.length ; i++) {
			if (dizi[i]<min){
				min=dizi[i];
				minIndex=i;
			}
			
		}
		System.out.println("min:"+min+" MinIndex "+minIndex);
	}
}