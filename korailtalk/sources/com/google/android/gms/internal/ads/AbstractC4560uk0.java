package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uk0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC4560uk0 {
    static int a(int i8, String str) {
        if (i8 >= 0) {
            return i8;
        }
        throw new IllegalArgumentException(str + " cannot be negative but was: " + i8);
    }

    static void b(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("null key in entry: null=".concat(String.valueOf(obj2)));
        }
        if (obj2 != null) {
            return;
        }
        throw new NullPointerException("null value in entry: " + obj.toString() + "=null");
    }
}
