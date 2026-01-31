package com.google.android.gms.internal.ads;

import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.ue, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4547ue {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f23087a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f23088b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f23089c;

    /* renamed from: d, reason: collision with root package name */
    private final long f23090d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f23091e;

    private C4547ue(InputStream inputStream, boolean z8, boolean z9, long j8, boolean z10) {
        this.f23087a = inputStream;
        this.f23088b = z8;
        this.f23089c = z9;
        this.f23090d = j8;
        this.f23091e = z10;
    }

    public static C4547ue zzb(InputStream inputStream, boolean z8, boolean z9, long j8, boolean z10) {
        return new C4547ue(inputStream, z8, z9, j8, z10);
    }

    public final long zza() {
        return this.f23090d;
    }

    public final InputStream zzc() {
        return this.f23087a;
    }

    public final boolean zzd() {
        return this.f23088b;
    }

    public final boolean zze() {
        return this.f23091e;
    }

    public final boolean zzf() {
        return this.f23089c;
    }
}
