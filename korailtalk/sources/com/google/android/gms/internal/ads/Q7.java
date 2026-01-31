package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* loaded from: classes2.dex */
public final class Q7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15735a;

    /* renamed from: b, reason: collision with root package name */
    private final String f15736b;

    public Q7(String str, String str2) {
        this.f15735a = str;
        this.f15736b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && Q7.class == obj.getClass()) {
            Q7 q72 = (Q7) obj;
            if (TextUtils.equals(this.f15735a, q72.f15735a) && TextUtils.equals(this.f15736b, q72.f15736b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f15735a.hashCode() * 31) + this.f15736b.hashCode();
    }

    public final String toString() {
        return "Header[name=" + this.f15735a + ",value=" + this.f15736b + "]";
    }

    public final String zza() {
        return this.f15735a;
    }

    public final String zzb() {
        return this.f15736b;
    }
}
