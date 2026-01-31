package com.google.android.material.internal;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

/* loaded from: classes2.dex */
public class p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private int f25034a;

    public p(Context context) {
        this(context, null);
    }

    public final int getUserSetVisibility() {
        return this.f25034a;
    }

    public final void internalSetVisibility(int i8, boolean z8) {
        super.setVisibility(i8);
        if (z8) {
            this.f25034a = i8;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i8) {
        internalSetVisibility(i8, true);
    }

    public p(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public p(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f25034a = getVisibility();
    }
}
