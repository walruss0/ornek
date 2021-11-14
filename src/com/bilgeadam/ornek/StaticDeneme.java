package com.bilgeadam.ornek;

public class StaticDeneme {
    //İnstance variable
    int sayi1;
    //class variable - değişken static ise class variable'dır

    static int sayi2;

    public static void main(String[] args) {

        // static olmayan değişkene, static methodtan erişilemez
        //Erişmek istiyorsak, class'ın kendi objesini oluşturarak erişeceğiz

        //Local variable'ı biz initialize etmek zorundayız.
        //Yani ilk değer vermek zorundayız.
        //Local variable main içinde oluşturdugumuz variable
        int sayi3=3;
        StaticDeneme sd = new StaticDeneme();
        System.out.println("sayi1:"+sd.sayi1);
        System.out.println("Sayi2:"+sayi2);
        System.out.println("Sayi3:"+sayi3);
    }
}
