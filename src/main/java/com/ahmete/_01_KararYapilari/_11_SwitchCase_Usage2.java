package com.ahmete._01_KararYapilari;

public class _11_SwitchCase_Usage2 {
	public static void main(String[] args) {
		int month = 50;
		String deger = "birşeyler";
		String ay = switch (month) {
			case 1 -> "Ocak";
			case 2 -> "Şubat";
			case 3 -> "Mart";
			case 4 -> "Nisan";
			case 5 -> "Mayıs";
			case 6 -> "Haziran";
			default -> "Yanlış ay girdiniz.";
		};
		
		System.out.println(ay);
		
		int gun=7;
		String gunTip=switch (gun){
			case 1,2,3,4,5 ->"Hafta İçi";
			case 6,7 ->"Hafta sonu";
			default -> "1-7 arası değer girebilirsiniz";
		};
		System.out.println(gunTip);
		
		
		String gunTip2=switch (gun){
			case 1,2,3,4,5 ->"Hafta İçi";
			case 6,7 ->"Hafta sonu";
			default -> "1-7 arası değer girebilirsiniz";
		};
		System.out.println(gunTip2);
	}
}