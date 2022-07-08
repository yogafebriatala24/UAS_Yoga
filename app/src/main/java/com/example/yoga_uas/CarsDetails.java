package com.example.yoga_uas;

public class CarsDetails {

    private String mRating;
    private String mProductName;
    private String mPrice;


    public CarsDetails(String mRating, String mProductName, String mPrice) {
        this.mRating = mRating;
        this.mProductName = mProductName;
        this.mPrice = mPrice;
    }


    public String getmRating() {
        return mRating;
    }

    public String getmProductName() {
        return mProductName;
    }

    public String getmPrice() {
        return mPrice;
    }
}