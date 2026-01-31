package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.J;

/* loaded from: classes.dex */
public class CTextView extends J {
    public CTextView(Context context) {
        super(context);
        b(context, null);
    }

    private void b(Context context, AttributeSet attributeSet) {
        a.getInstance().applyFont(context, this, attributeSet);
        setTextScaleX(0.95f);
    }

    public CTextView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        b(context, attributeSet);
    }

    public CTextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        b(context, attributeSet);
    }
}
