package com.google.android.material.textfield;

import android.content.Context;
import com.google.android.material.internal.CheckableImageButton;

/* loaded from: classes2.dex */
abstract class e {

    /* renamed from: a, reason: collision with root package name */
    TextInputLayout f25341a;

    /* renamed from: b, reason: collision with root package name */
    Context f25342b;

    /* renamed from: c, reason: collision with root package name */
    CheckableImageButton f25343c;

    e(TextInputLayout textInputLayout) {
        this.f25341a = textInputLayout;
        this.f25342b = textInputLayout.getContext();
        this.f25343c = textInputLayout.getEndIconView();
    }

    abstract void a();

    boolean b(int i8) {
        return true;
    }

    void c(boolean z8) {
    }

    boolean d() {
        return false;
    }
}
