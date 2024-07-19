package com.ahmete._07_Methods;

public class _05_finalParametreliMetod {
	public int hiz=0;
	
	public static void main(String[] args) {
		_05_finalParametreliMetod obj=new _05_finalParametreliMetod();
		System.out.println(obj.hiz);
		obj.hizArtir(50);
		System.out.println(obj.hiz);
	}
	
	/**
	 *
	 * @param yeniHiz final olarak tanımladıgımız için metod gövdesin bu parametrenin degeri değiştirilemez
	 *                final ile değiskeni sabit yapmayı görmüştü.Burada da parametre değişkeni sabitlenir
	 */
	public void hizArtir(final int yeniHiz){
		// yeniHiz=yeniHiz*2;
		
		hiz=yeniHiz;
	}
}