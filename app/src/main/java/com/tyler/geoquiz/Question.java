package com.tyler.geoquiz;

// The Question Class creates an object that holds a question and its answer
public class Question {

    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mAnswered;

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isAnswered() { return mAnswered; }

    public void setAnswered(boolean answered) { mAnswered = answered; }

    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
        mAnswered = false;
    }
}
