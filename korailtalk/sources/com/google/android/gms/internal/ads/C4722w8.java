package com.google.android.gms.internal.ads;

import java.io.InputStream;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.w8, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4722w8 {

    /* renamed from: a, reason: collision with root package name */
    private final int f23417a;

    /* renamed from: b, reason: collision with root package name */
    private final List f23418b;

    /* renamed from: c, reason: collision with root package name */
    private final int f23419c;

    /* renamed from: d, reason: collision with root package name */
    private final InputStream f23420d;

    public C4722w8(int i8, List list, int i9, InputStream inputStream) {
        this.f23417a = i8;
        this.f23418b = list;
        this.f23419c = i9;
        this.f23420d = inputStream;
    }

    public final int zza() {
        return this.f23419c;
    }

    public final int zzb() {
        return this.f23417a;
    }

    public final InputStream zzc() {
        InputStream inputStream = this.f23420d;
        if (inputStream != null) {
            return inputStream;
        }
        return null;
    }

    public final List zzd() {
        return Collections.unmodifiableList(this.f23418b);
    }
}
