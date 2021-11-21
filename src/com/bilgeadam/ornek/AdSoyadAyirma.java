package com.bilgeadam.ornek;

public class AdSoyadAyirma {
    public static void main(String[] args) {
        String isim= "Onur Yildirim";

        int boslukIndex = isim.indexOf(" ");

        String ad = isim.substring(0,boslukIndex);

        System.out.println("Ad:"+ad+"uzunluk:"+ad.length());

        String soyad = isim.substring(boslukIndex+1);

        System.out.println("Soyad:"+soyad+"Uzunluk:"+soyad.length());





    }
}
