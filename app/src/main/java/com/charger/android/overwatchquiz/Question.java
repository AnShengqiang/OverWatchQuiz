package com.charger.android.overwatchquiz;

/**
 * Created by a1877 on 2016/11/4.
 */

public class Question {

    /*文本问题id（int） & 文本答案(boolean)*/
    private int mTextResId;
    private boolean mAnswerTrue;

    /*构造方法*/
    public Question(int textResId, boolean answerTrue) {
        mTextResId = textResId;
        mAnswerTrue = answerTrue;
    }

    /*getters and setters*/
    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }
}
