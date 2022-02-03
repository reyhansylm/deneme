package com.example.meals;

import java.io.Serializable;

public class UyelikIslem implements Serializable {

    private String uyelikad;
    private int sifre;

    public UyelikIslem() {
    }

    public UyelikIslem(String uyelikad, int sifre) {
        this.uyelikad = uyelikad;
        this.sifre = sifre;
    }

    public String getUyelikad() {
        return uyelikad;
    }

    public void setUyelikad(String uyelikad) {
        this.uyelikad = uyelikad;
    }

    public int getSifre() {
        return sifre;
    }

    public void setSifre(int sifre) {
        this.sifre = sifre;
    }
}
