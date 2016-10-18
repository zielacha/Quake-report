package com.example.android.quakereport;

import java.text.SimpleDateFormat;

/**
 * Created by Anna on 13.10.2016.
 */
public class Earthquake {

    private double mMagnitude;
    private String mPlace;
    private long mDate;
    private String mUrl;

    public Earthquake(double magnitude, String place, long date, String url){
        mMagnitude = magnitude;
        mPlace = place;
        mDate = date;
        mUrl = url;
    }


    public double getMagnitude() {
        return mMagnitude;
    }

    public void setMagnitude(double magnitude) {
        this.mMagnitude = magnitude;
    }

    public String getPlace() {
        return mPlace;
    }

    public void setPlace(String place) {
        this.mPlace = place;
    }

    public long getDate() {
        return mDate;
    }

    public void setDate(long date) {
        this.mDate = date;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        this.mUrl = url;
    }
}
