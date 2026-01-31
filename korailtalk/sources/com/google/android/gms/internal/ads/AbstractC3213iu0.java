package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.iu0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3213iu0 {

    /* renamed from: a, reason: collision with root package name */
    static final Ww0 f20027a;

    /* renamed from: b, reason: collision with root package name */
    static final Ww0 f20028b;

    /* renamed from: c, reason: collision with root package name */
    static final Ww0 f20029c;

    static {
        Ww0 ww0Zzc = Ww0.zzc();
        f20027a = ww0Zzc;
        f20028b = ww0Zzc;
        f20029c = ww0Zzc;
        try {
            zza();
        } catch (GeneralSecurityException e8) {
            throw new ExceptionInInitializerError(e8);
        }
    }

    public static void zza() {
        C3897ou0.a();
        Rt0.a();
        AbstractC2412bu0.zza(true);
        if (AbstractC2293as0.zzb()) {
            return;
        }
        It0.zzd(true);
    }
}
