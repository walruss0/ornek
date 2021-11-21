package com.bilgeadam.ornek;

public class Farkli_if_Ornek {
    public static void main(String[] args) {
        int yas = 44;
         String durum = (yas<35)?"Genç":"Yaşlı";
        System.out.println(durum);

        if (yas<35) durum="Genç";
        if (yas>=35) durum="Yaşlı";
        System.out.println(durum);




    }
}
