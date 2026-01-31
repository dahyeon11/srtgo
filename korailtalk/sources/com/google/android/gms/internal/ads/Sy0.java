package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class Sy0 implements Nz0 {

    /* renamed from: a */
    private static final Sy0 f16358a = new Sy0();

    private Sy0() {
    }

    public static Sy0 zza() {
        return f16358a;
    }

    @Override // com.google.android.gms.internal.ads.Nz0
    public final Mz0 zzb(Class cls) {
        if (!Zy0.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: ".concat(cls.getName()));
        }
        try {
            return (Mz0) Zy0.z(cls.asSubclass(Zy0.class)).p();
        } catch (Exception e8) {
            throw new RuntimeException("Unable to get message info for ".concat(cls.getName()), e8);
        }
    }

    @Override // com.google.android.gms.internal.ads.Nz0
    public final boolean zzc(Class cls) {
        return Zy0.class.isAssignableFrom(cls);
    }
}
