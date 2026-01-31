package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.lt0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3553lt0 implements InterfaceC4009pt0 {

    /* renamed from: a, reason: collision with root package name */
    private final Mx0 f20783a;

    /* renamed from: b, reason: collision with root package name */
    private final C4242rw0 f20784b;

    private C3553lt0(C4242rw0 c4242rw0, Mx0 mx0) {
        this.f20784b = c4242rw0;
        this.f20783a = mx0;
    }

    public static C3553lt0 zza(C4242rw0 c4242rw0) {
        return new C3553lt0(c4242rw0, At0.zza(c4242rw0.zzi()));
    }

    public static C3553lt0 zzb(C4242rw0 c4242rw0) {
        return new C3553lt0(c4242rw0, At0.zzb(c4242rw0.zzi()));
    }

    public final C4242rw0 zzc() {
        return this.f20784b;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC4009pt0
    public final Mx0 zzd() {
        return this.f20783a;
    }
}
