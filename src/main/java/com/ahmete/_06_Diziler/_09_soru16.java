package com.ahmete._06_Diziler;

//dizideki en yüksek sayiyi bulma


import java.util.Scanner;

public class _09_soru16 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("dizi kac elemanlı olsun");
		int[] dizi=new int[input.nextInt()];
		
		System.out.println("dizi elamanlarını giriniz");
		
		for (int i = 0; i < dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz");
			dizi[i]=input.nextInt();
			
		}
		//en büyük elemanı bulalım; 2, 5 , 3
		int max=dizi[0]; //max;2
		int maxIndex=0;
		for (int i = 0; i < dizi.length; i++) {
			if (dizi[i]>max){
				max=dizi[i]; //max;5
				maxIndex=i;
			}
		}
		System.out.println("max:"+max+" MaxIndex "+maxIndex);
	}
	
}