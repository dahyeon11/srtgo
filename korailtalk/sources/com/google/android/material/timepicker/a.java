package com.google.android.material.timepicker;

import android.text.InputFilter;
import android.text.Spanned;

/* loaded from: classes2.dex */
class a implements InputFilter {

    /* renamed from: a, reason: collision with root package name */
    private int f25431a;

    public a(int i8) {
        this.f25431a = i8;
    }

    @Override // android.text.InputFilter
    public CharSequence filter(CharSequence charSequence, int i8, int i9, Spanned spanned, int i10, int i11) {
        try {
            StringBuilder sb = new StringBuilder(spanned);
            sb.replace(i10, i11, charSequence.subSequence(i8, i9).toString());
            if (Integer.parseInt(sb.toString()) <= this.f25431a) {
                return null;
            }
            return "";
        } catch (NumberFormatException unused) {
            return "";
        }
    }

    public int getMax() {
        return this.f25431a;
    }

    public void setMax(int i8) {
        this.f25431a = i8;
    }
}
