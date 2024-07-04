package com.ahmete._01_KararYapilari;
/*
Bir seyahat uygulaması yazıyorsunuz ve kullanıcının gideceği şehre göre bilet fiyatını hesaplamanız gerekiyor.
Ankara'ya gidecek kullanıcılara 100 TL,
İstanbul'a gidecek kullanıcılara 200 TL,
 izmir'e gidecek kullanıcılara 150 TL,
 diğer şehirlere gidecek kullanıcılara ise "Geçerli bir şehir seçiniz." mesajı gösterilmelidir.

 */

import java.util.Scanner;

public class _03_Soru3 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Gideceğiniz şehri yazınız:");
		String sehir=sc.nextLine();
		int tutar=0;
		
		if(sehir.equalsIgnoreCase("Ankara")){
			tutar=100;
		}
		else if(sehir.equalsIgnoreCase("İstanbul")){
			tutar=200;
		}
		else if(sehir.equalsIgnoreCase("İzmir")){
			tutar=150;
		}
		else {
			System.out.println("Geçerli bir şehir seçiniz.");
		}
		System.out.println(tutar+" TL ödeme yapmalısınız.");
		
	}
}