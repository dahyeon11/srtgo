package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.util.AttributeSet;
import androidx.appcompat.widget.N;

/* loaded from: classes.dex */
public class CToggleButton extends N {
    public CToggleButton(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a.getInstance().applyFont(context, this, attributeSet);
        setTextScaleX(0.95f);
    }

    public CToggleButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CToggleButton(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet);
    }
}
