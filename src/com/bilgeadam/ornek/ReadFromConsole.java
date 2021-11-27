package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsole {
    public static void main(String[] args) {
        try {

        //Scanner objesiyle konsoldan veri okuyabiliyoruz.
        Scanner sc = new Scanner(System.in);
        System.out.print("isminizi giriniz:");
        String isim = sc.nextLine();
        System.out.print("Yaşınızı giriniz:");
        int yas = sc.nextInt();

        //int yas = (int)Double.parseDouble(sc.nextLine());

        if (yas<=35)
        {
            System.out.println("Yolun 1. yarısındasınız.Yaş:"+yas);
        }
        else
        {
            System.out.println("Yolun 2. yarısındasınız.Yaş:"+yas);
        }
        }
        catch (InputMismatchException e){
            System.err.println("Hata:Yaş alanına sayi girmek zorundasınız.");
        }
        catch (Exception e){
            //System.err.println("Hata oluştu:"+e.getMessage());
            e.printStackTrace();
        }
    }
}
