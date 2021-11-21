package com.bilgeadam.ornek;

public class AritmetikOrnek {
    public static void main(String[] args) {

        int sayi1 = 7;
        int sayi2 = 2;

        double sonuc = (double)sayi1/sayi2;
        System.out.println(sonuc);

        System.out.println("---------------------------------------");

        //Modulus --> %
        System.out.println(5%2);

        int sayi3 = 21;
        if ((sayi3%2) == 1) System.out.println("Tek sayi");
        else System.out.println("Çift sayi");

        System.out.println("---------------------------------------");

        //++ operatör
        int sayi4 = 9;

        System.out.println("sayi4:"+sayi4++);
        System.out.println("sayi4:"+sayi4);

        int sayi5 = 24;
        System.out.println("Sayi5:"+ ++sayi5);
        System.out.println("Sayi5:"+ sayi5);

    }
}
