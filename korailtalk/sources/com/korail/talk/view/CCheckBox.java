package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0847g;

/* loaded from: classes.dex */
public class CCheckBox extends C0847g {
    public CCheckBox(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        setClickable(true);
        a.getInstance().applyFont(context, this, attributeSet);
        setTextScaleX(0.95f);
    }

    public CCheckBox(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CCheckBox(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet);
    }
}
