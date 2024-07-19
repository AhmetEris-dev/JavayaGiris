package com.ahmete._02_Donguler._04_DongulerGenel;
/*
swtich-case,for,while,do while gibi yapılarda donguyu veya blogu sonlandırmak için kullanılır.
 */

public class _01_BreakFor {
	public static void main(String[] args) {
		for (int i = 0; i <10 ; i++) {
			if (i==3){
				break;
				
			}
			System.out.println(i);
		}
		System.out.println("for dongusu sonlandı");
	}
}