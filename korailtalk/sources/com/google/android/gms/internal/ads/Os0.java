package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class Os0 {

    /* renamed from: a, reason: collision with root package name */
    private final Mx0 f15157a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f15158b;

    /* synthetic */ Os0(Mx0 mx0, Class cls, Ns0 ns0) {
        this.f15157a = mx0;
        this.f15158b = cls;
    }

    public static Os0 zzb(Ms0 ms0, Mx0 mx0, Class cls) {
        return new Ls0(mx0, cls, ms0);
    }

    public abstract AbstractC1730Oo0 zza(InterfaceC4009pt0 interfaceC4009pt0);

    public final Mx0 zzc() {
        return this.f15157a;
    }

    public final Class zzd() {
        return this.f15158b;
    }
}
