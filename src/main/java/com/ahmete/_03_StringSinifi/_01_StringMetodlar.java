package com.ahmete._03_StringSinifi;

import java.util.Locale;

public class _01_StringMetodlar {
	public static void main(String[] args) {
		
		//01 Legenth(): String değerin karakter sayisini verir
		String s1="hello world";
		System.out.println(s1.length());
		// length kelimenin uzunlugunu verir
		int uzunluk= s1.length();
		System.out.println(uzunluk);
		
		String s2="";
		System.out.println(s2.length());
		
		//02 charAt(int index) : Stringde belirtilen indexteki karakteri döndürür. index değerleri 0 dan başlar ve uzunlugun 1 eksiğine kadar devam eder
		//         01234
		String s3="hello world";
		s3.charAt(2) ;
		System.out.println(s3.charAt(2));           //index kacıncı harfi int değeri olarak cağırmak
		
		//ilk karakteri almak için index 0 girersiniz
		// son karakteri almak için: length()-1
		
		System.out.println("son karakter: "+s3.charAt(s3.length()-1));
		
		//03 substring belirtilen indexteki karakterden başlayarak sona kadar(veya belirtilen sonIndex e kadar) olan Stringi geri döner
		String str="merhaba dünya";
		System.out.println(str.substring(8)); // bu kullanımda verilen beginIndex değeri dahildir(inclusive)
		
		System.out.println(str.substring(0,3)); // bu kullanımda verilen beginIndex değeri dahil,endIndex değeri hariçtir
		
		System.out.println(str.substring(str.length()-1)); //length:13 sonindex:11
		
		//04 concat(String str) : Stringe belirli bir stringi ekleyerek yeni bir String değer oluşur
		str="Merhaba";
		System.out.println(str.concat(" Java15"));
		//05 indexof
		//   0123456
		str="Merhaba";
		System.out.println(str.indexOf('a')); // 4 değeri döner.
		System.out.println(str.indexOf("aba"));
		//verilen strindeki 2. a nın indexteki oldugunu bulalım
		int ilkAIndex = str.indexOf('a');
		System.out.println("ilk A index:"+ilkAIndex);
		int ikinciAIndex = str.indexOf('a', ilkAIndex+1);
		System.out.println("ikinci A index:"+ikinciAIndex);
		System.out.println("lastIndexOf('h'):"+str.lastIndexOf('h')); // sondan başlayarak arama yapar. Bulduğu indexi döner.
		
		//06. equals,equalsIgnoreCase : String değişkenin değerlerinin eşitliğini kontrol etmek için kullanılır, geriye boolean değer döner.
		String str1="merhaba";
		String str2="Merhaba";
		Object obj="Merhaba";
		obj=500;
		obj='a';
		obj=true;
		
		System.out.println(str1.equals(str2));
		System.out.println(str1.equalsIgnoreCase(str2));
		
		if(str1.equals(str2)) {
			System.out.println("Bu kelimeler birbirine eşit.");
		}
		else{
			System.out.println("Bu kelimeler farklı");
		}
		
		//07. compareTo,compareToIgnoreCase: compareTo ilk karakterden başlayarak karşılaştırma yapar. Eğer ilk karakterler aynı ise sonraki karakterler arasında karşılaştırma yaparak devam eder.
		// eğer her 2 stringde aynı ise geriye 0 döner.
		str1="Ahmet"; //65
		str2="Cilal"; //67
		System.out.println(str1.compareTo(str2)); // 65-67 = -2
		String str3="Zeynep"; //90
		String str4="Zeynep"; //97
		System.out.println(str3.compareTo(str4)); //90-97=-7
		System.out.println(str3.compareToIgnoreCase(str4)); //z:122 a:97 122-97=25
		
		//08. toUpperCase
		System.out.println(str1.toUpperCase());
		str1="istanbul";
		System.out.println(str1.toUpperCase()); // İSTANBUL
		str1="i love istanbul";
		Locale turkLocale=new Locale("tr", "TR"); //deprecated 19 versiyonu ile kaldırılmış
		Locale englishLocaleNew=new Locale.Builder().setLanguage("en").setRegion("US").build();
		Locale turkishLocaleNew=new Locale.Builder().setLanguage("tr").setRegion("TR").build();
		System.out.println(str1.toUpperCase(englishLocaleNew)); // I LOVE ISTANBUL
		
		//09. toLowerCase
		System.out.println(str1.toLowerCase());
		
		//10. trim : Baştaki ve sondaki boşlukları temizler.
		str1="   Merhaba Java15    ";
		System.out.println(str1.trim());
		
		//11. replace
		str1="   Merhaba Java15    ";
		String replacedString = str1.trim().toLowerCase().replace('a', 'o');
		System.out.println(replacedString);
		
		//12. contains
		str1="Java15";
		System.out.println( str1.contains("a")); //true
		System.out.println( str1.contains("av")); //true
		System.out.println( str1.contains("16")); //false
		
		//13. startsWith, endsWith
		str1="Java15";
		System.out.println(str1.startsWith("Ja"));
		System.out.println(str1.startsWith("av"));
		System.out.println(str1.endsWith("av"));
		System.out.println(str1.endsWith("a15"));
		
		//14. Escape Characters:
		System.out.println("Bugün \"Ankara'da\" hava yağmurlu");
		System.out.println("Ad\t\t\tSoyad");
		System.out.println("Barış\t\tDemirci");
		System.out.println("Alexander\tDemirci");
		System.out.println("Alexander\nWalker");
		
		//Soru:
		str1=" Merhaba Dünya ";
		
		System.out.println(str1.trim().replace(" ","!")); //Merhaba!Dünya
		
		System.out.println(str1.replace(" ","!").trim()); //!Merhaba!Dünya!
		
		
		
		
		
		
		
	}
}