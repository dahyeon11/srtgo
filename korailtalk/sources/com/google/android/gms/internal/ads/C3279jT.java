package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.jT, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3279jT implements GD0 {

    /* renamed from: a, reason: collision with root package name */
    private final XD0 f20258a;

    public C3279jT(XD0 xd0) {
        this.f20258a = xd0;
    }

    @Override // com.google.android.gms.internal.ads.GD0, com.google.android.gms.internal.ads.PD0, com.google.android.gms.internal.ads.XD0
    /* renamed from: zza, reason: merged with bridge method [inline-methods] */
    public final String zzb() {
        String packageName = ((C2990gx) this.f20258a).zza().getPackageName();
        OD0.zzb(packageName);
        return packageName;
    }
}
