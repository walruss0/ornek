package com.bilgeadam.ornek;

import java.util.Locale;

public class KucukBuyukHarfeCevirme {
    public static void main(String[] args) {
        String isim1 = "Mustafa";
        // Büyük harfe çevir.
        System.out.println(isim1.toUpperCase(Locale.ROOT));
        String isim2 = "BOra";
        System.out.println(isim2.toLowerCase(Locale.ROOT));

        String isim3 = "İzmirli IĞDELER";
        System.out.println(isim3.toUpperCase(Locale.ROOT));
        System.out.println(isim3.replace('i','İ').toUpperCase(Locale.ROOT));

        String isim4 = "IĞDIRLI İspanaklar";
        System.out.println(isim4.toLowerCase(Locale.ROOT));
        System.out.println(isim4.replace('I','ı').toLowerCase(Locale.ROOT));

        Locale localeTR = new Locale("tr","TR");
        String kelime1 = "izinli İSTANBUL";
        System.out.println(kelime1.toUpperCase(localeTR));
    }
}
