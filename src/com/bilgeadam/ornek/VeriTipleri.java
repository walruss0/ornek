package com.bilgeadam.ornek;

public class VeriTipleri {
    public static void main(String[] args) {
        int yes = 20;
        char cinsiyet = 'E';
        String sehir = "Ankara";
        if (yes<35){
            System.out.println("Genç");
        }
        else{
            System.out.println("Yaşlı");
        }
        for (int i=1;i<=10;i++){
            System.out.println(i+"Merhaba");
        }
        if (sehir.indexOf("k")>=0){
            System.out.println("İçinde k harfi var");
        }
    }
}
