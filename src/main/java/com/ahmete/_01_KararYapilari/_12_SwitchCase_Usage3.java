package com.ahmete._01_KararYapilari;

public class _12_SwitchCase_Usage3 {
	public static void main(String[] args) {
		int n=1;
		double sayi1=10;
		double sayi2=20;
		double result;
		
		double sonuc=switch (n){
			case 1->{
				result=sayi1+sayi2;
				yield result;
			}
			case 2->{
				result=sayi1-sayi2; // result:-10 olarak hesaplandı.
				yield result; // yield ile result değeri sonuc değişkenine aktarıldı. //yield geriye değer döndürmek için kullanılmıştır. (return keywordü gibi davranır.)
			}
			default -> throw new IllegalStateException("Unexpected value: " + n); //hata gönderdik.
		};
		
		System.out.println(sonuc);
	}
}