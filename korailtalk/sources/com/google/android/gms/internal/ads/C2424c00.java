package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.c00, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2424c00 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18227a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f18228b = Integer.toString(1, 36);
    public final String zza;
    public final int zzb;

    public C2424c00(String str, int i8) {
        this.zza = str;
        this.zzb = i8;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putString(f18227a, this.zza);
        bundle.putInt(f18228b, this.zzb);
        return bundle;
    }
}
