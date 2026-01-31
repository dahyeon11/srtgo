package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class Ss0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f16349a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f16350b;

    /* synthetic */ Ss0(Class cls, Class cls2, Rs0 rs0) {
        this.f16349a = cls;
        this.f16350b = cls2;
    }

    public static Ss0 zzb(Qs0 qs0, Class cls, Class cls2) {
        return new Ps0(cls, cls2, qs0);
    }

    public abstract InterfaceC4009pt0 zza(AbstractC1730Oo0 abstractC1730Oo0);

    public final Class zzc() {
        return this.f16349a;
    }

    public final Class zzd() {
        return this.f16350b;
    }
}
