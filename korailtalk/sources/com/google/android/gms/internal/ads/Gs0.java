package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes2.dex */
public final class Gs0 {

    /* renamed from: b */
    private static final Gs0 f13214b = new Gs0();

    /* renamed from: a */
    private final AtomicReference f13215a = new AtomicReference(new C2638dt0(new Zs0(null), null));

    Gs0() {
    }

    public static Gs0 zza() {
        return f13214b;
    }

    public final Class zzb(Class cls) {
        return ((C2638dt0) this.f13215a.get()).zza(cls);
    }

    public final Object zzc(C5138zo0 c5138zo0, Class cls) {
        return ((C2638dt0) this.f13215a.get()).zzb(c5138zo0, cls);
    }

    public final Object zzd(C3325jt0 c3325jt0, Class cls) {
        return ((C2638dt0) this.f13215a.get()).zzc(c3325jt0, cls);
    }

    public final synchronized void zze(Ws0 ws0) {
        Zs0 zs0 = new Zs0((C2638dt0) this.f13215a.get(), null);
        zs0.zza(ws0);
        this.f13215a.set(new C2638dt0(zs0, null));
    }

    public final synchronized void zzf(InterfaceC1771Po0 interfaceC1771Po0) {
        Zs0 zs0 = new Zs0((C2638dt0) this.f13215a.get(), null);
        zs0.zzb(interfaceC1771Po0);
        this.f13215a.set(new C2638dt0(zs0, null));
    }
}
