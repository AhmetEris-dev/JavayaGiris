package com.ahmete._02_Donguler._03_for;


import java.util.Scanner;

public class _10_For_Ucgen3 {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		String yildiz="*";
		int sayi;
		sayi=scanner.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			for (int j = i; j < sayi; j++) {
				
				System.out.print(" ");
				
			}
			for (int j = 0; j <i ; j++) {
				System.out.print(yildiz);
				
			}
			System.out.println();
			
		}
		
		
		
	}
}