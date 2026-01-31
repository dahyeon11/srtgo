package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public abstract class Ws0 {

    /* renamed from: a, reason: collision with root package name */
    private final Class f17074a;

    /* renamed from: b, reason: collision with root package name */
    private final Class f17075b;

    /* synthetic */ Ws0(Class cls, Class cls2, Vs0 vs0) {
        this.f17074a = cls;
        this.f17075b = cls2;
    }

    public static Ws0 zzb(Us0 us0, Class cls, Class cls2) {
        return new Ts0(cls, cls2, us0);
    }

    public abstract Object zza(C5138zo0 c5138zo0);

    public final Class zzc() {
        return this.f17074a;
    }

    public final Class zzd() {
        return this.f17075b;
    }
}
