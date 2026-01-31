package com.korail.talk.view;

import I4.a;
import android.content.Context;
import android.os.Handler;
import android.util.AttributeSet;
import android.widget.TextClock;
import z4.C6630d;

/* loaded from: classes.dex */
public class CTextClock extends TextClock {
    public CTextClock(Context context) {
        super(context);
        a(context, null);
    }

    private void a(Context context, AttributeSet attributeSet) {
        a.getInstance().applyFont(context, this, attributeSet);
    }

    @Override // android.view.View
    public Handler getHandler() {
        Handler handler = super.getHandler();
        return C6630d.isNull(handler) ? new Handler() : handler;
    }

    public CTextClock(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    public CTextClock(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        a(context, attributeSet);
    }
}
