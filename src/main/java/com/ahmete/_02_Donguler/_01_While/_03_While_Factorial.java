package com.ahmete._02_Donguler._01_While;
/*
Kullanıcıdan alınan sayının faktöryelini bulan programı while kullanarak yazınız.
5! = 5*4*3*2*1 = 120
4! = 4*3*2*1 =24
3! = 3*2*1 =6
 */

import java.util.Scanner;

public class _03_While_Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Faktoryeli alınacak sayıyı giriniz: ");
		int sayi = sc.nextInt();
		long factorial = 1;
		
		while (sayi > 0) {
			
			factorial *= sayi;
			sayi--;
			
		}
		System.out.println("=" + factorial);
	}
}