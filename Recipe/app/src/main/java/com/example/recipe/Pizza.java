package com.example.recipe;

import android.os.Parcel;
import android.os.Parcelable;

import java.io.Serializable;

public class Pizza implements Parcelable {

    private String sucuk;
    private String salam;
    private String sosis;
    private String mantar;
    private String mısır;
    private String zeytin;


    public Pizza() {
    }

    public Pizza(String sucuk, String salam, String sosis, String mantar, String mısır, String zeytin) {
        this.sucuk = sucuk;
        this.salam = salam;
        this.sosis = sosis;
        this.mantar = mantar;
        this.mısır = mısır;
        this.zeytin = zeytin;
    }

    protected Pizza(Parcel in) {
        sucuk = in.readString();
        salam = in.readString();
        sosis = in.readString();
        mantar = in.readString();
        mısır = in.readString();
        zeytin = in.readString();
    }

    public static final Creator<Pizza> CREATOR = new Creator<Pizza>() {
        @Override
        public Pizza createFromParcel(Parcel in) {
            return new Pizza(in);
        }

        @Override
        public Pizza[] newArray(int size) {
            return new Pizza[size];
        }
    };

    public String getSucuk() {
        return sucuk;
    }

    public void setSucuk(String sucuk) {
        this.sucuk = sucuk;
    }

    public String getSalam() {
        return salam;
    }

    public void setSalam(String salam) {
        this.salam = salam;
    }

    public String getSosis() {
        return sosis;
    }

    public void setSosis(String sosis) {
        this.sosis = sosis;
    }

    public String getMantar() {
        return mantar;
    }

    public void setMantar(String mantar) {
        this.mantar = mantar;
    }

    public String getMısır() {
        return mısır;
    }

    public void setMısır(String mısır) {
        this.mısır = mısır;
    }

    public String getZeytin() {
        return this .zeytin;
    }

    public void setZeytin(String zeytin) {
        this.zeytin = zeytin;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(sucuk);
        parcel.writeString(salam);
        parcel.writeString(sosis);
        parcel.writeString(mantar);
        parcel.writeString(mısır);
        parcel.writeString(zeytin);
    }
}
