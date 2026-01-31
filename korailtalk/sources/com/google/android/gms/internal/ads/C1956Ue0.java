package com.google.android.gms.internal.ads;

import android.content.Context;

/* renamed from: com.google.android.gms.internal.ads.Ue0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1956Ue0 {

    /* renamed from: b, reason: collision with root package name */
    private static final C1956Ue0 f16695b = new C1956Ue0();

    /* renamed from: a, reason: collision with root package name */
    private Context f16696a;

    private C1956Ue0() {
    }

    public static C1956Ue0 zzb() {
        return f16695b;
    }

    public final Context zza() {
        return this.f16696a;
    }

    public final void zzc(Context context) {
        this.f16696a = context != null ? context.getApplicationContext() : null;
    }
}
