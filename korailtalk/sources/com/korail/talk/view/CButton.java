package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0846f;

/* loaded from: classes.dex */
public class CButton extends C0846f {
    public CButton(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a.getInstance().applyFont(context, this, attributeSet);
        setTextScaleX(0.95f);
    }

    public CButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet);
    }
}
