package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Ge0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1383Ge0 {

    /* renamed from: a, reason: collision with root package name */
    private final String f13185a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13186b;

    private C1383Ge0(String str, String str2) {
        this.f13185a = str;
        this.f13186b = str2;
    }

    public static C1383Ge0 zza(String str, String str2) {
        AbstractC3981pf0.zzb(str, "Name is null or empty");
        AbstractC3981pf0.zzb(str2, "Version is null or empty");
        return new C1383Ge0(str, str2);
    }

    public final String zzb() {
        return this.f13185a;
    }

    public final String zzc() {
        return this.f13186b;
    }
}
