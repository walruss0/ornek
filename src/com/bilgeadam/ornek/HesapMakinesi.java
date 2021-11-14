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
        HesapMakinesi hm = new HesapMakinesi();
        System.out.println(hm.topla(5,7));
        System.out.println(hm.carpma(5,10));
        System.out.println(hm.bolme(7,2));
        System.out.println(hm.cikar(7,5));

        int sonuc = hm.topla(9,11);
        System.out.println("Sonuç: "+sonuc);
    }
}
