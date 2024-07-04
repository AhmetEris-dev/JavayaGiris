package com.ahmete._01_KararYapilari;
/*
Kullanıcının girdiği not bilgisine göre(Scanner) harf notu hesaplayan bir program yazmanız gerekiyor.
95 -> 9 ? 99/10=9
 90 ve üzeri AA,    9,10
 80-89 arası BA,    8
 70-79 arası BB,    7
 60-69 arası CB,    6
 50-59 arası CC,    5
 40-49 arası DC,    4
 30-39 arası DD,    3
 0-29 arası FF      0,1,2
 
 olarak belirlenmiştir.
 
 Bu durumda switch-case yapısı kullanarak bir program yazınız.
 */

import java.util.Scanner;

public class _13_SwitchCase_Soru1 {
	public static void main(String[] args) {
		
		//Kullanıcıdan not değerini alma:
		Scanner sc = new Scanner(System.in);
		System.out.println("Notunuzu giriniz:");
		int not=sc.nextInt();
		String harfNotu;
		
		if(not<0 || not>100){
			System.out.println("0-100 arası not girişi yapmalısınız!!!");
		}
		else {
			
			harfNotu=	switch (not / 10) {
				case 9,10-> "AA";
				case 8-> "AB";
				case 7-> "BB";
				case 6-> "BC";
				case 5-> "CC";
				case 4->"DC";
				case 3->"DD";
				default->"FF";
			};
			System.out.println(not + " için Harf Notu:" + harfNotu);
		}
		
		
		
	}
}