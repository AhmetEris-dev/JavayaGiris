package com.ahmete._07_Methods;

public class GetterAndSetterMethods {
	public String ad;
	public String soyad;
	private Integer yas; // sadece bu class dan erisim içim
	
	public Integer getYas() {
		return yas;
	}
	
	public void setYas(Integer yas) {
		if (yas < 100 && yas > 100) {
			this.yas = yas;
		}
		else {
			System.out.println("yas degeri 10-100 arasında olabilir");
		}
		
	}
}

class Deneme {
	public static void main(String[] args) {
		// sınıftan bir nesne oluşturma
		GetterAndSetterMethods obj = new GetterAndSetterMethods();
		//nesne uzerinden sınıfır değişkenlere erisim;
		// obj.yas=150;
		obj.setYas(150);
		obj.ad = "ali";
		obj.soyad = "calısan";
		System.out.println(obj.ad);
		System.out.println(obj.soyad);
		System.out.println(obj.getYas());
	}
}