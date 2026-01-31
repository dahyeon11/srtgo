package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
public final class HD0 implements GD0, AD0 {

    /* renamed from: b, reason: collision with root package name */
    private static final HD0 f13306b = new HD0(null);

    /* renamed from: a, reason: collision with root package name */
    private final Object f13307a;

    private HD0(Object obj) {
        this.f13307a = obj;
    }

    public static GD0 zza(Object obj) {
        OD0.zza(obj, "instance cannot be null");
        return new HD0(obj);
    }

    public static GD0 zzc(Object obj) {
        return obj == null ? f13306b : new HD0(obj);
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    public final Object zzb() {
        return this.f13307a;
    }
}
