package com.google.android.gms.internal.ads;

import android.text.TextUtils;

/* renamed from: com.google.android.gms.internal.ads.fZ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C2828fZ {

    /* renamed from: a, reason: collision with root package name */
    final String f19198a;

    /* renamed from: b, reason: collision with root package name */
    final String f19199b;

    /* renamed from: c, reason: collision with root package name */
    int f19200c;

    /* renamed from: d, reason: collision with root package name */
    long f19201d;

    /* renamed from: e, reason: collision with root package name */
    final Integer f19202e;

    C2828fZ(String str, String str2, int i8, long j8, Integer num) {
        this.f19198a = str;
        this.f19199b = str2;
        this.f19200c = i8;
        this.f19201d = j8;
        this.f19202e = num;
    }

    public final String toString() {
        String str = this.f19198a + "." + this.f19200c + "." + this.f19201d;
        if (!TextUtils.isEmpty(this.f19199b)) {
            str = str + "." + this.f19199b;
        }
        if (!((Boolean) H1.C.zzc().zza(AbstractC4439th.zzbD)).booleanValue() || this.f19202e == null || TextUtils.isEmpty(this.f19199b)) {
            return str;
        }
        return str + "." + this.f19202e;
    }
}
