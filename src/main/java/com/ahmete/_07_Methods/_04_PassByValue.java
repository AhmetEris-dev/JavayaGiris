package com.ahmete._07_Methods;
/*
javada metodlar pass-by-value şeklinde calısır
primitive data type lar parametre olarak kullanılırsa beklenildiği gibi gönderilen değişkenin değeri metod içindeki değişimden etkilenmez
complex(reference) typelar parametre olarak kullanılırsa gönderilen nesnenin adresi metod a aktarılır. O yüzden metod içinde yapılan değişim direkt olarak o nesne uzerinde gercekleştirilir
 */

public class _04_PassByValue {
	public static void main(String[] args) {
		int sayi=10;
		artir(sayi);
		System.out.println("sayi="+sayi);
		
		Adet adetRef=new Adet(); //yeni bir adet nesnesi oluşturduk
		artirAdet(adetRef); // nesnenin adresini göndermiş oluruz
		System.out.println("AdetRef i değeri="+adetRef.i);
		
	}
	public static void artir(int i){
		i++;
		System.out.println("i="+i);
	}
	
	public static void artirAdet(Adet adet){
		adet.i++;
		System.out.println("adet.i="+adet.i);
	}
	
}
class Adet{
	int i=5;
}