package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class WD0 implements PD0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f16941c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile PD0 f16942a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f16943b = f16941c;

    private WD0(PD0 pd0) {
        this.f16942a = pd0;
    }

    public static PD0 zza(PD0 pd0) {
        return ((pd0 instanceof WD0) || (pd0 instanceof FD0)) ? pd0 : new WD0(pd0);
    }

    @Override // com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final Object zzb() {
        Object obj = this.f16943b;
        if (obj != f16941c) {
            return obj;
        }
        PD0 pd0 = this.f16942a;
        if (pd0 == null) {
            return this.f16943b;
        }
        Object objZzb = pd0.zzb();
        this.f16943b = objZzb;
        this.f16942a = null;
        return objZzb;
    }
}
