package com.ahmete._02_Donguler._04_DongulerGenel;

public class _06_ContinueIcIceFor {
	public static void main(String[] args) {
		//ilk durum:
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				if(i==3 && j==2){
					continue; //sadece iç döngüyü kırdı.
				}
				System.out.println("i: "+i+",j: "+j);
			}
			
		}
		System.out.println("Döngüler sonlandı.");
	}
}