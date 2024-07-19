package com.ahmete._05_RandomSinifi;

import java.util.Random;

public class _00_RandomSinifi {
	public static void main(String[] args) {
		Random rand = new Random();
		System.out.println(rand.nextInt()); // int değer olarak alabileceği herhangi bir değeri üretir.
		System.out.println(rand.nextInt(10)); // Alabileceği değerler 0 ile 10 arasındadır. Ama 10 hariç. [0,10)
		
		//Zar 1 2 3 4 5 6
		System.out.println(rand.nextInt(6)+1);
		System.out.println(rand.nextInt(1,7));
		
		System.out.println(rand.nextDouble());
		System.out.println(rand.nextDouble(10));
		System.out.println(rand.nextDouble(10,20));
		System.out.println(rand.nextInt(1,50));
		
	}
}