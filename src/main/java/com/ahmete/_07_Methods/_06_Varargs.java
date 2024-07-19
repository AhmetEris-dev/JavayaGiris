package com.ahmete._07_Methods;

public class _06_Varargs {
	public static void main(String[] args) {
		int sum1=sum(5,10);
		int sum2=sum(5,10,15);
		sum(5,6,7,6);
		sum(5,6,7,6,10);
		sum(5,6,9,8,7,1,2,3,4,5);
		
		System.out.println("sum1 "+ sum1);
		System.out.println("sum2 "+ sum2);
		
		
	}
	// dışarıdan 2 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir topla methodu yazınız.
	public static  int sum(int sayi1,int sayi2){
		return sayi1+sayi2;
	}
	// dışarıdan 3 int sayi parametre olarak alan ve toplamlarını int olarak dönen bir topla methodu yazınız.
	public static  int sum(int sayi1,int sayi2,int sayi3){
		return sayi1+sayi2+sayi3;
		
	}
	public static int sum(int...sayilar){
		int sum=0;
		for (int item:sayilar){
			sum +=item;
			
		}
		return sum;
	}
	
}