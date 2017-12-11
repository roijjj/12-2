package com.bignerdranch.android.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by cody on 9/23/2017.
 */

public class Crime {

    private UUID mId;
    private Date mDate;
    private boolean mSolved;
    private String mTitle;

    public UUID getId() {
        return mId;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }
    public Date getDate() {
        return mDate;    }
    public void setDate(Date date) {
        mDate = date;    }
    public boolean isSolved() {
        return mSolved;
    }
    public void setSolved(boolean solved) {
        mSolved = solved;
    }

    public Crime() {
        // Generate unique identifier
         mId = UUID.randomUUID();
        mDate = new Date();

    }
}
