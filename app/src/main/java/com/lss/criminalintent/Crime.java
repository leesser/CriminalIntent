package com.lss.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by shuai on 16-6-12.
 */
public class Crime {
    private UUID mId;
    private String mTitle;
    private Date mData;
    private boolean mSolved;

    public Date getData() {
        return mData;
    }

    public boolean isSolved() {
        return mSolved;
    }

    public void setData(Date mData) {
        this.mData = mData;
    }

    public void setSolved(boolean mSolved) {
        this.mSolved = mSolved;
    }

    public String getTitle() {
        return mTitle;

    }

    public UUID getId() {

        return mId;
    }

    public void setTitle(String mTitle) {
        this.mTitle = mTitle;
    }

    public Crime() {

        //生成唯一标识符
        mId = UUID.randomUUID();
        mData=new Date();

    }
}
