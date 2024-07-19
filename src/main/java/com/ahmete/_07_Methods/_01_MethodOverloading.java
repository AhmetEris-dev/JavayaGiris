package com.ahmete._07_Methods;
// method Overloading aynı isimde farklı parametre tiplerinde veya farklı parametre sayılarında metodlar yazmak.
// bir sınıf içinde aynı isimde birden fazla metod olabilir ama aynı metod imzasına sahip birden fazla metod olamaz
public class _01_MethodOverloading {
	public static void main(String[] args) {
		int sum1=sum(5,10);
		int sum2=sum(5,10,15);
		double sum3=sum(2.50,10,15);
		System.out.println("sum1 "+ sum1);
		System.out.println("sum2 "+ sum2);
		System.out.println("sum3 "+ sum3);
	
	}
	// dışarıdan 2 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir topla methodu yazınız.
	public static  int sum(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	// dışarıdan 3 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir topla methodu yazınız.
	public static  int sum(int sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
		
    }
	// dışarıdan 3 int double parametre olarak alan ve toplamlarını double olarak dönen bir topla methodu yazınız.
	public static  double sum(double sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
		
	}
}