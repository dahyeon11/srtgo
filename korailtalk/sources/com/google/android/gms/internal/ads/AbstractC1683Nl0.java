package com.google.android.gms.internal.ads;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.ads.Nl0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1683Nl0 implements Comparator {
    protected AbstractC1683Nl0() {
    }

    public static AbstractC1683Nl0 zzb(Comparator comparator) {
        return new C1600Lk0(comparator);
    }

    public static AbstractC1683Nl0 zzc() {
        return C1602Ll0.f14350a;
    }

    @Override // java.util.Comparator
    public abstract int compare(Object obj, Object obj2);

    public AbstractC1683Nl0 zza() {
        return new C2052Wl0(this);
    }
}
