package com.example.nson.customerview.Model;

/**
 * Created by NSON on 28-03-2017.
 */

public class Contact {
    private int mColor;
    private String mName;
    private String mNumber;
    public Contact(String mName, String mNumber,int mColor) {
        this.mColor = mColor;
        this.mNumber = mNumber;
        this.mName = mName;
    }

    public int getmColor() {
        return mColor;
    }

    public void setmColor(int mColor) {
        this.mColor = mColor;
    }

    public String getmName() {
        return mName;
    }

    public void setmName(String mName) {
        this.mName = mName;
    }

    public String getmNumber() {
        return mNumber;
    }

    public void setmNumber(String mNumber) {
        this.mNumber = mNumber;
    }
}
