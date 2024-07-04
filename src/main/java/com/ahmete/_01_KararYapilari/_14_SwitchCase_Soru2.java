package com.ahmete._01_KararYapilari;

public class _14_SwitchCase_Soru2 {
	public static void main(String[] args) {
		char karakter='b';
		switch(karakter){
			case 97:
				System.out.println("a harfi girildi...");
				break;
			case 'b':
				System.out.println("b harfi girildi...");
				break;
			default:
				System.out.println("hangi harf bilemedim.");
		}
		
		String deger="Ankara";
		switch (deger.toLowerCase()){ //.toLowerCase() uygulandığı String ifadedeki tüm karakterleri küçük harfe dönüştür. AnKaRa=> ankara
			case "ankara":
				System.out.println("06");
				break;
			case "istanbul":
				System.out.println("34");
				break;
			default:
				System.out.println("Plakasını bilemedim.");
		}
	}
}