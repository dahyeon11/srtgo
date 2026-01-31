package com.google.android.gms.internal.ads;

import android.app.Activity;

/* renamed from: com.google.android.gms.internal.ads.jW, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3282jW extends HW {

    /* renamed from: a, reason: collision with root package name */
    private Activity f20267a;

    /* renamed from: b, reason: collision with root package name */
    private J1.u f20268b;

    /* renamed from: c, reason: collision with root package name */
    private String f20269c;

    /* renamed from: d, reason: collision with root package name */
    private String f20270d;

    C3282jW() {
    }

    @Override // com.google.android.gms.internal.ads.HW
    public final HW zza(Activity activity) {
        if (activity == null) {
            throw new NullPointerException("Null activity");
        }
        this.f20267a = activity;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HW
    public final HW zzb(J1.u uVar) {
        this.f20268b = uVar;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HW
    public final HW zzc(String str) {
        this.f20269c = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HW
    public final HW zzd(String str) {
        this.f20270d = str;
        return this;
    }

    @Override // com.google.android.gms.internal.ads.HW
    public final IW zze() {
        Activity activity = this.f20267a;
        if (activity != null) {
            return new C3510lW(activity, this.f20268b, this.f20269c, this.f20270d, null);
        }
        throw new IllegalStateException("Missing required properties: activity");
    }
}
