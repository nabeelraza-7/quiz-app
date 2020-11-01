package com.example.quiz;

public class Question {
    private int mTextResId;
    private boolean mTruthValue;

    public Question(int textResId, boolean truthValue){
        this.mTextResId = textResId;
        this.mTruthValue = truthValue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isTruthValue() {
        return mTruthValue;
    }

    public void setTruthValue(boolean truthValue) {
        mTruthValue = truthValue;
    }
}
