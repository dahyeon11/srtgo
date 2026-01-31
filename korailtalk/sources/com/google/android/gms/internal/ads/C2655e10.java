package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* renamed from: com.google.android.gms.internal.ads.e10, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2655e10 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f18716a = Integer.toString(0, 36);

    /* renamed from: b, reason: collision with root package name */
    private static final String f18717b = Integer.toString(1, 36);

    /* renamed from: c, reason: collision with root package name */
    private static final String f18718c = Integer.toString(2, 36);
    public final int zza;
    public final int zzb;
    public final int zzc;

    public C2655e10(int i8, int i9, int i10) {
        this.zza = i8;
        this.zzb = i9;
        this.zzc = i10;
    }

    public final Bundle zza() {
        Bundle bundle = new Bundle();
        bundle.putInt(f18716a, this.zza);
        bundle.putInt(f18717b, this.zzb);
        bundle.putInt(f18718c, this.zzc);
        return bundle;
    }
}
