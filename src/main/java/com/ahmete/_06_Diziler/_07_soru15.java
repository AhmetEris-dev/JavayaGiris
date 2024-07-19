package com.ahmete._06_Diziler;

import java.util.Arrays;
import java.util.Scanner;
/*
 * 5 elemanlı bir int dizisi tanımlayın,
 * kullanıcıdan alınan değerleri bu diziye aktarın.
 * Ardından dizinin elemanlarının sırasını ters çevirip,
 * yazdırın.
 */

public class _07_soru15 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		int [] dizi=new int[5];
		for (int i = 0; i < dizi.length ; i++) {
			System.out.print((i+1)+". sayiyi giriniz");
			dizi[i]=input.nextInt();
			
		}
		System.out.println(Arrays.toString(dizi));
		// sadece sondan başa doğru yazdırma
		/*for (int i = dizi.length-1; i >=0 ; i--) {
			System.out.print(dizi[i]+" ");
			
		}
		
		 */
		int temp;
		// dizi[0] = dizi[4] yer değiştirmeli
		// dizi[1] = dizi[3] yer değiştirmeli
		for (int i = 0; i < dizi.length/2 ; i++) {
			temp=dizi[i]; //temp:10
			dizi[i]=dizi[dizi.length-1-i];
			dizi[dizi.length-1-i]=temp;
			
		}
		System.out.println(Arrays.toString(dizi));
	}
}