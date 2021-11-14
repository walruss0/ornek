package com.bilgeadam.ornek;

public class HesapMakinesi {
    public int topla(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public int carpma(int sayi1, int sayi2){
        return sayi1*sayi2;
    }

    public double bolme(int sayi1, int sayi2){
        return sayi1/(double)sayi2;
    }

    public int cikar(int sayi1, int sayi2){
        return sayi1+sayi2;
    }

    public static void main(String[] args) {
        HesapMakinesi nm = new HesapMakinesi();
        System.out.println(nm.topla(5,7));
        System.out.println(nm.carpma(5,10));
        System.out.println(nm.bolme(7,2));
        System.out.println(nm.cikar(7,5));
    }
}
