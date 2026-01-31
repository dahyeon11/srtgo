package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ml0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1642Ml0 {
    static Object a(Object obj, int i8) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("at index " + i8);
    }

    static Object[] b(Object[] objArr, int i8) {
        for (int i9 = 0; i9 < i8; i9++) {
            a(objArr[i9], i9);
        }
        return objArr;
    }
}
