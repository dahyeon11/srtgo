package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class FD0 implements PD0, AD0 {

    /* renamed from: c, reason: collision with root package name */
    private static final Object f12967c = new Object();

    /* renamed from: a, reason: collision with root package name */
    private volatile PD0 f12968a;

    /* renamed from: b, reason: collision with root package name */
    private volatile Object f12969b = f12967c;

    private FD0(PD0 pd0) {
        this.f12968a = pd0;
    }

    public static AD0 zza(PD0 pd0) {
        return pd0 instanceof AD0 ? (AD0) pd0 : new FD0(pd0);
    }

    public static PD0 zzc(PD0 pd0) {
        return pd0 instanceof FD0 ? pd0 : new FD0(pd0);
    }

    @Override // com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final Object zzb() {
        Object objZzb = this.f12969b;
        Object obj = f12967c;
        if (objZzb == obj) {
            synchronized (this) {
                try {
                    objZzb = this.f12969b;
                    if (objZzb == obj) {
                        objZzb = this.f12968a.zzb();
                        Object obj2 = this.f12969b;
                        if (obj2 != obj && obj2 != objZzb) {
                            throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj2 + " & " + objZzb + ". This is likely due to a circular dependency.");
                        }
                        this.f12969b = objZzb;
                        this.f12968a = null;
                    }
                } finally {
                }
            }
        }
        return objZzb;
    }
}
