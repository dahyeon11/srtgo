package com.google.android.material.internal;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewOverlay;

/* loaded from: classes2.dex */
class m implements n {

    /* renamed from: a, reason: collision with root package name */
    private final ViewOverlay f25026a;

    m(View view) {
        this.f25026a = view.getOverlay();
    }

    @Override // com.google.android.material.internal.n
    public void add(Drawable drawable) {
        this.f25026a.add(drawable);
    }

    @Override // com.google.android.material.internal.n
    public void remove(Drawable drawable) {
        this.f25026a.remove(drawable);
    }
}
