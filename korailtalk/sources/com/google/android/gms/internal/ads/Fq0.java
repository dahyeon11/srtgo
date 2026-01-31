package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class Fq0 {
    public static final Fq0 zza = new Fq0("ASSUME_AES_GCM");
    public static final Fq0 zzb = new Fq0("ASSUME_XCHACHA20POLY1305");
    public static final Fq0 zzc = new Fq0("ASSUME_CHACHA20POLY1305");
    public static final Fq0 zzd = new Fq0("ASSUME_AES_CTR_HMAC");
    public static final Fq0 zze = new Fq0("ASSUME_AES_EAX");
    public static final Fq0 zzf = new Fq0("ASSUME_AES_GCM_SIV");

    /* renamed from: a, reason: collision with root package name */
    private final String f13078a;

    private Fq0(String str) {
        this.f13078a = str;
    }

    public final String toString() {
        return this.f13078a;
    }
}
