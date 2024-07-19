package com.ahmete._07_Methods;
// static field veya metodlar sınıfa bağlıdır.
// non-static field veya metodlar nesneye bağlıdır.
public class _03_Static {
	int sayi1=10;// static olmayan field
	static int sayi2=20;//static olan field
	
	public void selam(){ //statik metod değil = non-static metod
		System.out.println("selam");
	}
	public static void merhaba(){
		System.out.println("merhaba");
	}
}

class DenemeStatic{
	public static void main(String[] args) {
		// static olmayan field lara erişmek için önce sınıftan bir nesne üretmek gereklidir
		_03_Static obj=new _03_Static();
		System.out.println(obj.sayi1);
		
		// static olmayan field lara erişmek için önce sınıftan bir nesne üretmek gereklidir
		obj.selam();
		
		
		// static field lara erişmek için sadece sınıf adı yzazmak yeterlidir nesne oluşturmaya gerek yoktur
		System.out.println(_03_Static.sayi2);
		
		// static field lara erişmek için sadece sınıf adı yzazmak yeterlidir nesne oluşturmaya gerek yoktur
		_03_Static.merhaba();
	}
}