package com.bilgeadam.ornek;

public class FinallyOrnek {
    public static void main(String[] args) {
        try
        {
         int sayi1 = 7;
         int sayi2 = 0;
         System.out.println(sayi1/sayi2);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        finally
        {
            System.out.println("adasdasd");
        }
    }
}
