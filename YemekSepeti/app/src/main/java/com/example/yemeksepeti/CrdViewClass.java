package com.example.yemeksepeti;

public class CrdViewClass {

    private int yemekid;
    private String yemekad;
    private int yemekfiyat;
    private String yemekresimad;

    public CrdViewClass() {
    }

    public CrdViewClass(int yemekid, String yemekad, int yemekfiyat, String yemekresimad) {
        this.yemekid = yemekid;
        this.yemekad = yemekad;
        this.yemekfiyat = yemekfiyat;
        this.yemekresimad = yemekresimad;
    }

    public int getYemekid() {
        return yemekid;
    }

    public void setYemekid(int yemekid) {
        this.yemekid = yemekid;
    }

    public String getYemekad() {
        return yemekad;
    }

    public void setYemekad(String yemekad) {
        this.yemekad = yemekad;
    }

    public int getYemekfiyat() {
        return yemekfiyat;
    }

    public void setYemekfiyat(int yemekfiyat) {
        this.yemekfiyat = yemekfiyat;
    }

    public String getYemekresimad() {
        return yemekresimad;
    }

    public void setYemekresimad(String yemekresimad) {
        this.yemekresimad = yemekresimad;
    }
}
