package com.ahmete._06_Diziler;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.OptionalInt;

public class _14_ArraysSinifi {
	public static void main(String[] args) {
		int[]sayilar={6,8,2,5,3};
		String []isimler={"Ahmet","Su","Can","Pelin","Atakan"};
		
		// 1. Arrays.toString: bu metod içine verilen dizideki elemanları [] içinde aralarına virgül ekleyerek
		System.out.println("Orjinal Dizi"+ Arrays.toString(sayilar));
		System.out.println("Orjinal Dizi"+ Arrays.toString(isimler));
		
		//2.Arrays.sort Diziye doğal sıralama uygular (doğal sıralama kucukten buyuge, A->Z ye doğru yapılan sıralamadır
		Arrays.sort(sayilar);
		Arrays.sort(isimler);
		
		System.out.println("Arrays.sort işleminden sonra"+ Arrays.toString(sayilar));
		System.out.println("Arrays.sort işleminden sonra"+ Arrays.toString(isimler));
		System.out.println(sayilar[0]);
		
		//3.Arrays.binarySearch aranan eleman listede varsa index numarasını döner eğer yoksa negatif bir deger döner
		int index = Arrays.binarySearch(sayilar, 8);
		System.out.println((index>0)?"aranan eleman dizide bulundu":"eleman dizide yok");
		
		//4.Arrays.equals karşılaştırılan diziler içindeki elemanlar ve elemanların sırası aynı ise true döner aksi halde false döner.
		int[] array1={0,1,2};
		int[] array2={0,1,2};
		Boolean equals= Arrays.equals(array1,array2);
		System.out.println(equals);
		
		//5.Arrays.fill
		int[] array3=new int[10];
		System.out.println("Array3 ilk hali "+Arrays.toString(array3));
		Arrays.fill(array3,1);
		System.out.println("Array3 fill işleminden sonraki hali "+Arrays.toString(array3));
		
		Arrays.fill(array3,4,7,2);
		System.out.println("Array3 ilk hali "+Arrays.toString(array3));
		
		//6.Arrays.copyOf // yeni bir diziye var olan dizinin kopyasını aktarmak için kullanılabilir.Ayrıca yeni dizinin elaman sayisi belirlenebilir.
		int[] array4={5,2,8,4,6};
		int[] array5=Arrays.copyOf(array4,10);
		System.out.println(Arrays.toString(array5));
		
		//7.Arrays.copyOfRangebütün dizinin bir kopyasını değil de o diziden belirli bir aralığını kopyasını almak için kullanılır
		int[] array6=Arrays.copyOfRange(array4,0,3);
		System.out.println(Arrays.toString(array6));
		
		//8.Arrays.stream
		//toplamak için : sum
		int sum = Arrays.stream(array4).sum();
		System.out.println("sum():"+sum);
		
		
		//average: ortalama
		OptionalDouble average=Arrays.stream(array4).average();
		System.out.println("average():"+average.getAsDouble());
		
		//count eleman sayısı
		Long count = Arrays.stream(array4).count();
		System.out.println("count():"+count);
		
		//max-min
		OptionalInt max = Arrays.stream(array4).max();
		OptionalInt min = Arrays.stream(array4).min();
		System.out.println("max(): "+max.getAsInt()+" min() "+min.getAsInt());
		
		//9.Array.asList bir array'i list'e cevirme
		int[] array7={8,2,5,6};
		List<int[]> list = Arrays.asList(array7); // dizinin adresini getirir
		System.out.println(list);
		
		Integer[] array8={8,2,5,6};
		List<Integer> list1 = Arrays.asList(array8);
		System.out.println(list1);
		
		//10. Arrays.deepToString iki boyutlu dizi yazdırma için kullanılır
		int[][] ikiBoyutluDizi={
				{1,2,3,4},
				{5,6,7,8},
				{9,10,11,12}
		};
		System.out.println(Arrays.deepToString(ikiBoyutluDizi));
		
		
		
		
		
	}
}