package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.e50, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2663e50 implements N50 {

    /* renamed from: a, reason: collision with root package name */
    private final String f18726a;

    /* renamed from: b, reason: collision with root package name */
    private final String f18727b;

    C2663e50(String str, String str2) {
        this.f18726a = str;
        this.f18727b = str2;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final int zza() {
        return 31;
    }

    @Override // com.google.android.gms.internal.ads.N50
    public final com.google.common.util.concurrent.C zzb() {
        return AbstractC1483In0.zzh(new C2778f50(this.f18726a, this.f18727b));
    }
}
