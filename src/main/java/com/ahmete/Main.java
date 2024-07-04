package com.ahmete;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world! ");

        int i = 10;


        String ad = "ahmet ";
        System.out.println(ad + i + " yasında");

        int sayi1, sayi2, toplam;
        sayi1 = i;
        sayi2 = i + 1;
        toplam = sayi1 + sayi2;
        System.out.println(toplam);


        int sicaklik = 30;
        if (sicaklik > 20) {
            System.out.println("klimayi calıştır");

        } else {
            System.out.println("klimayi durdur");
        }
        sicaklik = 15;
        if (sicaklik < 0) {
            System.out.println("klimayi cok ac");
        }
        


    }
}