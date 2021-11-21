package com.bilgeadam.ornek;

public class RelationalOrnek {
    public static void main(String[] args) {
        // == != > >= < <=

        int sayi1 = 9;
        int sayi2 = 9;

        String isim1 = "Mustafa";
        String isim2 = "Mustafa";

        String isim3 = new String("Onur");
        String isim4 = new String("Onur");

        if (sayi1==sayi2)
            System.out.println("Eşittir");
        else
            System.out.println("Eşit Değildir.");

        if (isim1==isim2)
            System.out.println("İsimler Eşittir");
        else
            System.out.println("İsimler Eşit Değildir.");

        System.out.println("İsim3:"+ isim3);

        if (isim3==isim4)
            System.out.println("obje İsimler Eşittir");
        else
            System.out.println("obje İsimler Eşit Değildir.");

        //String'de == değerine bakmaz, memory'deki adresine bakar.
        //Önemli! --> String ifadeler == ile değil, equals ile kontrol edilir.
        //String'de equals, oluşturulma biçiminden bağımsız olarak hep doğru çalışır.

        if (isim3.equals(isim4)) // (!(isim3.equals(isim4))) olsaydı değildi demek "!"
            System.out.println("Equals İsimler Eşittir");
        else
            System.out.println("Equals İsimler Eşit Değildir.");






    }
}
