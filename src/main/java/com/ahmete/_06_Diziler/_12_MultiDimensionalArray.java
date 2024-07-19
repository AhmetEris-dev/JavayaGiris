package com.ahmete._06_Diziler;

public class _12_MultiDimensionalArray {
	public static void main(String[] args) {
		// tanımlama:
		
		int[] sayilar={5,6,7}; // tek boyutlu dizi
		int[][] koordinatlar={ // iki boyutlu dizi. satır:3 , sutun:2
			{1,2},
			{3,4},
			{5,6}
		};
		int[][] koordinatlar2={
				{1,2,3},
				{4,5,6}
		};
		int[] sayilar2= new int[10]; // 10 elemanlı tek boyutlu dizi
		sayilar2[0]=5;
		
		int[][] koordinatlar3=new int[3][2]; //3 satır 2 sutunlu iki boyutlu bir dizi
		koordinatlar3[0][0]=1; //0.satır 0.sutun
		koordinatlar3[0][1]=2; //0.satır 1.sutun
		
		koordinatlar3[1][0]=3; //1.satır 0.sutun
		koordinatlar3[1][1]=4; //1.satır 1.sutun
		
		koordinatlar3[2][0]=5; //2.satır 0.sutun
		koordinatlar3[2][1]=6; //2.satır 1.sutun
		
		//dizideki elemanları yazıdrma:
		System.out.println("koordinatlar3.length"+koordinatlar3.length);// satır sayisi
		System.out.println("koordinatlar3[0].length"+koordinatlar3[0].length); // 0.satırın sutun sayısını getirir (2)
		
		for (int i = 0; i < koordinatlar3.length; i++) {
			for (int j = 0; j <koordinatlar3[0].length ; j++) {
				System.out.println(koordinatlar3[i][j]);
				
			}
			
		}
		
	}
}