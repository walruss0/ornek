package com.bilgeadam.ornek;

public class Oyuncu {

    private int no;
    private String ad;
    private String soyad;
    //static tanımlanırsa class veriable'dır.
    //bir obje değeri değiştirirse
    //diger objelerde değişen değeri görür
    //static demezsek instance variable'dır
    //her obje değişkenlerin ilk değerleriyle başlar
    //ornek, int ise sıfır değeriyle başlar her obje için
    //bir objenin değişkende yağtıgı değişikliği diğer objeler görmez
    private static int sayac;

    public Oyuncu() {
        sayac=sayac+1;
        //sayac+=1;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getSayac() {
        return sayac;
    }

    public void setSayac(int sayac) {
        this.sayac = sayac;
    }
}
