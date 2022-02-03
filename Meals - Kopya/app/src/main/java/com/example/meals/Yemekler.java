package com.example.meals;

import android.telephony.ims.ImsManager;
import android.widget.ImageView;

import java.io.Serializable;

public class Yemekler implements Serializable {

    String yemekad;
    int yemekfiyat;
    String yemekImageId;

    public Yemekler() {
    }

    public Yemekler(String yemekad, int yemekfiyat, String yemekImageId) {
        this.yemekad = yemekad;
        this.yemekfiyat = yemekfiyat;
        this.yemekImageId = yemekImageId;
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

    public String getYemekImageId() {
        return yemekImageId;
    }

    public void setYemekImageId(String yemekImageId) {
        this.yemekImageId = yemekImageId;
    }
}
