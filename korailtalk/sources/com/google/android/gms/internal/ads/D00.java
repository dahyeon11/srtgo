package com.google.android.gms.internal.ads;

import android.text.Spannable;

/* loaded from: classes2.dex */
public abstract class D00 {
    public static void zza(Spannable spannable, Object obj, int i8, int i9, int i10) {
        for (Object obj2 : spannable.getSpans(i8, i9, obj.getClass())) {
            if (spannable.getSpanStart(obj2) == i8 && spannable.getSpanEnd(obj2) == i9 && spannable.getSpanFlags(obj2) == 33) {
                spannable.removeSpan(obj2);
            }
        }
        spannable.setSpan(obj, i8, i9, 33);
    }
}
