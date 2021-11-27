package com.bilgeadam.ornek;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ReadFromConsoleSon {
    static String isim;
    static int yas ;
    Scanner sc = new Scanner(System.in);
    public String isimSor()
    {
        String isim ="";
        System.out.println("İsminizi Giriniz:");
        isim = sc.nextLine();
        return isim;
    }
    public int yasSor ()
    {
        try
        {
            int localyas = 0;
            System.out.println("Yaşınızı giriniz:");
            localyas = Integer.parseInt(sc.nextLine());
            return localyas;
        }
        catch (NumberFormatException e)
        {
            System.err.println("Hata:Yaş alanına sayi girmek zorundasın!");
            return -99;
        }
    }

    public void sonucYazdir()
    {
        if (yas<=35) System.out.println("Yolun 1. yarisindasiniz.Yaş:"+ yas);
        else System.out.println("Yolun 2. yarisindasiniz.Yaş:"+ yas);
    }

    public static void main(String[] args) {
        ReadFromConsoleSon ab = new ReadFromConsoleSon();
        isim =ab.isimSor();
        yas =ab.yasSor();

        while (yas<0)
        {
            yas = ab.yasSor();
        }

    }






}
