package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes2.dex */
public final class J8 extends C4163rD0 implements Closeable {

    /* renamed from: i, reason: collision with root package name */
    private static final AbstractC4961yD0 f13597i = AbstractC4961yD0.zzb(J8.class);

    public J8(InterfaceC4277sD0 interfaceC4277sD0, I8 i8) {
        zzf(interfaceC4277sD0, interfaceC4277sD0.zzc(), i8);
    }

    @Override // com.google.android.gms.internal.ads.C4163rD0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.C4163rD0
    public final String toString() {
        String string = this.f22398b.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 7);
        sb.append("model(");
        sb.append(string);
        sb.append(")");
        return sb.toString();
    }
}
