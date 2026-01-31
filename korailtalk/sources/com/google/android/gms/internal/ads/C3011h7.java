package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.h7, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3011h7 {

    /* renamed from: a, reason: collision with root package name */
    private final String f19760a;

    /* renamed from: b, reason: collision with root package name */
    private final int f19761b;

    /* renamed from: c, reason: collision with root package name */
    private final int f19762c;

    /* renamed from: d, reason: collision with root package name */
    private int f19763d;

    /* renamed from: e, reason: collision with root package name */
    private String f19764e;

    public C3011h7(int i8, int i9, int i10) {
        String str;
        if (i8 != Integer.MIN_VALUE) {
            str = i8 + "/";
        } else {
            str = "";
        }
        this.f19760a = str;
        this.f19761b = i9;
        this.f19762c = i10;
        this.f19763d = Integer.MIN_VALUE;
        this.f19764e = "";
    }

    private final void a() {
        if (this.f19763d == Integer.MIN_VALUE) {
            throw new IllegalStateException("generateNewId() must be called before retrieving ids.");
        }
    }

    public final int zza() {
        a();
        return this.f19763d;
    }

    public final String zzb() {
        a();
        return this.f19764e;
    }

    public final void zzc() {
        int i8 = this.f19763d;
        int i9 = i8 == Integer.MIN_VALUE ? this.f19761b : i8 + this.f19762c;
        this.f19763d = i9;
        this.f19764e = this.f19760a + i9;
    }
}
