package com.ahmete._02_Donguler._03_for;

import java.util.Scanner;

public class _09_For_Ucgen2 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scanner.nextInt();
		String yildiz="*";
		int i;
		
		for (int j = sayi; j >=1 ; j--) {
			
			for (i=1 ; i<=j;i++){
				System.out.print(yildiz);
			}
			System.out.println(" ");
		}
	
	}
}