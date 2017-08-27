package com.example.android.quakereport;

/**
 * Created by ridhwan on 26/08/2017.
 */

public class Earthquake {

    private double mMagnitude;

    private String mLocation;

    private long mTimeInMiliseconds;


    public Earthquake(double magnitude, String location, long timeInMiliseconds){
        mMagnitude = magnitude;
        mLocation = location;
        mTimeInMiliseconds = timeInMiliseconds;
    }

    public double getMagnitude(){
        return mMagnitude;
    }

    public String getLocation(){
        return mLocation;
    }

    public long getTimeInMiliseconds(){
        return mTimeInMiliseconds;
    }
}
