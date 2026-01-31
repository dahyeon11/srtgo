package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.r6, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4148r6 {

    /* renamed from: a, reason: collision with root package name */
    private final C3724nL0 f22376a;

    /* renamed from: b, reason: collision with root package name */
    private final int f22377b;

    /* renamed from: c, reason: collision with root package name */
    private final int f22378c;

    /* renamed from: d, reason: collision with root package name */
    private float f22379d = 1.0f;

    public C4148r6(C3724nL0 c3724nL0, int i8, int i9) {
        this.f22376a = c3724nL0;
        this.f22377b = i8;
        this.f22378c = i9;
    }

    public final C4148r6 zza(float f8) {
        this.f22379d = f8;
        return this;
    }

    public final C4378t7 zzb() {
        return new C4378t7(this.f22376a, this.f22377b, this.f22378c, this.f22379d, 0L, null);
    }
}
