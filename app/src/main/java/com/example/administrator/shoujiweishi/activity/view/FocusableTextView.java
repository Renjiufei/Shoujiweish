package com.example.administrator.shoujiweishi.activity.view;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;

/**
 * Created by Administrator on 2016/7/18.
 */
public class FocusableTextView extends TextView {
    public FocusableTextView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    private void init() {
        setEllipsize(TextUtils.TruncateAt.MARQUEE);
        //获取焦点
        setFocusable(true);
        //确保能够获取到焦点
        setFocusableInTouchMode(true);
        setMarqueeRepeatLimit(-1);
    }

    @Override
    public boolean isFocused() {
        //获取焦点
        return true;
    }
}
