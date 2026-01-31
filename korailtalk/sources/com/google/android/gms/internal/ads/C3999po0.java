package com.google.android.gms.internal.ads;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: com.google.android.gms.internal.ads.po0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3999po0 {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f21807a;

    private C3999po0(InputStream inputStream) {
        this.f21807a = inputStream;
    }

    public static C3999po0 zzb(byte[] bArr) {
        return new C3999po0(new ByteArrayInputStream(bArr));
    }

    public final C5154zw0 zza() throws IOException {
        try {
            return C5154zw0.zzg(this.f21807a, Iy0.zza());
        } finally {
            this.f21807a.close();
        }
    }
}
