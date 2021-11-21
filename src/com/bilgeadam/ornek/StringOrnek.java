package com.bilgeadam.ornek;

public class StringOrnek {
    public static void main(String[] args) {

        //indexOf

        String kelime1 = "Sivas";
        System.out.println(kelime1.indexOf("S"));
        String kelime2 = "onur barış";
        System.out.println(kelime2.indexOf(" "));

        //substring

        String kelime3 ="Trabzon";
        System.out.println(kelime3.substring(3));
        System.out.println(kelime3.substring(2,4));

        //length

        String kelime4 = "Trabzon";
        System.out.println(kelime4.length());

        String kelime5 = "            Trabzon            ";
        System.out.println(kelime5.length());

        //trim, başındaki sonundaki boşlukları atar.
        System.out.println(kelime5.trim().length());












    }
}
