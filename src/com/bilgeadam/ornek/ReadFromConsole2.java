package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole2 {
    public static void main(String[] args) {
        int yas = 0;

        //Scanner objesiyle konsoldan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);
        System.out.print("isminizi giriniz:");
        String isim = sc.nextLine();
        System.out.print("Yaşınızı giriniz:");
        //int yas = sc.nextInt();
            try {
             yas = sc.nextInt();
            }
            catch (InputMismatchException e){
          System.err.println("Hata:Yaş alanına sayi girmek zorundasınız.");
          System.exit(-1);
             }

        if (yas<=35)
        {
            System.out.println("Yolun 1. yarısındasınız.Yaş:"+yas);
        }
        else
        {
            System.out.println("Yolun 2. yarısındasınız.Yaş:"+yas);
        }

    }
}
