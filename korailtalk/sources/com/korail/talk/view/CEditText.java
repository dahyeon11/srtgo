package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0851k;

/* loaded from: classes.dex */
public class CEditText extends C0851k {
    public CEditText(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a.getInstance().applyFont(context, this, attributeSet);
        setTextScaleX(0.95f);
    }

    public CEditText(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CEditText(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet);
    }
}
